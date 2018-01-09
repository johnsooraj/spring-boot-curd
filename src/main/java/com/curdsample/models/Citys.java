package com.curdsample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citys {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cityId;

	private String cityName;

	public Citys() {

	}

	public Citys(Long cityId, String cityName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public Long getId() {
		return cityId;
	}

	public void setId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

}
