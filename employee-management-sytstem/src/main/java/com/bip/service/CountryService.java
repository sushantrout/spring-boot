package com.bip.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bip.dto.CountryDTO;
import com.bip.entity.Country;
import com.bip.mapper.CountryMapper;
import com.bip.repo.CountryRepo;

@Service
public class CountryService {
	@Autowired
	private CountryRepo countryRepo;

	@Autowired
	private CountryMapper mapper;

	public List<CountryDTO> getAllCounries() {
		List<Country> findAll = countryRepo.findAll();
		return findAll.stream().map(e -> {
			return mapper.getCountryDTO(e);
		}).collect(Collectors.toList());
	}

	public List<CountryDTO> getByName(String countryName) {
		List<Country> byCountryName = countryRepo.findByCountryNameContains(countryName);
		return byCountryName.stream().map(e -> {
			return mapper.getCountryDTO(e);
		}).collect(Collectors.toList());
	}
}
