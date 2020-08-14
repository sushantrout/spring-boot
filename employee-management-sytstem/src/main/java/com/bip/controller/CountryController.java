package com.bip.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bip.dto.CountryDTO;
import com.bip.dto.ResponseList;
import com.bip.service.CountryService;

@RestController
@RequestMapping(value = "/api/country")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping
	public ResponseEntity<ResponseList<CountryDTO>> getCountries(@RequestParam(name = "countryName", defaultValue = "")String countryName) {
		List<CountryDTO> allCounries = new ArrayList<>();
		if(countryName != null && !countryName.isEmpty()) {
			allCounries = countryService.getByName(countryName);
		} else {
			allCounries = countryService.getAllCounries();
		}
		ResponseList<CountryDTO> res = new ResponseList<>();
		res.setInfoList(allCounries);
		ResponseEntity<ResponseList<CountryDTO>> responseEntity = new ResponseEntity<ResponseList<CountryDTO>>(res,
				HttpStatus.OK);
		return responseEntity;
	}
}
