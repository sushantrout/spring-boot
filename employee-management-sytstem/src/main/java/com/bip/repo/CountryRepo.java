package com.bip.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bip.entity.Country;
import java.lang.String;
import java.util.List;

public interface CountryRepo extends JpaRepository<Country, Long> {
	List<Country> findByCountryNameContains(String countryname);
}
