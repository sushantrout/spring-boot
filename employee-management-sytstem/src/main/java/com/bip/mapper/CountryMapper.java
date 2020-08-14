package com.bip.mapper;

import org.springframework.stereotype.Component;

import com.bip.dto.CountryDTO;
import com.bip.entity.Country;

@Component
public class CountryMapper {
	public CountryDTO getCountryDTO(Country e){
		Long id = e.getId();
		String countryName = e.getCountryName();
		String threeCharCountryCode = e.getThreeCharCountryCode();
		String twoCharCountryCode = e.getTwoCharCountryCode();
		CountryDTO countryDTO = new CountryDTO(id, countryName, twoCharCountryCode, threeCharCountryCode);
		return countryDTO;
	}
}
