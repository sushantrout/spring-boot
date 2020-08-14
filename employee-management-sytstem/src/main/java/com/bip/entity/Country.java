package com.bip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
	@Id
	@Column(name = "country_id")
	private Long id;
	
	@Column(name = "country_name")
	private String countryName;
	
	@Column(name = "two_char_country_code")
	private String twoCharCountryCode;
	
	@Column(name = "three_char_country_code")
	private String threeCharCountryCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getTwoCharCountryCode() {
		return twoCharCountryCode;
	}

	public void setTwoCharCountryCode(String twoCharCountryCode) {
		this.twoCharCountryCode = twoCharCountryCode;
	}

	public String getThreeCharCountryCode() {
		return threeCharCountryCode;
	}

	public void setThreeCharCountryCode(String threeCharCountryCode) {
		this.threeCharCountryCode = threeCharCountryCode;
	}
}
