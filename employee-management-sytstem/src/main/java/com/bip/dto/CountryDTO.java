package com.bip.dto;

public class CountryDTO {
	private Long id;
	private String countryName;
	private String twoCharCountryCode;
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

	public CountryDTO(Long id, String countryName, String twoCharCountryCode, String threeCharCountryCode) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.twoCharCountryCode = twoCharCountryCode;
		this.threeCharCountryCode = threeCharCountryCode;
	}

	public CountryDTO() {
		super();
	}
}
