package com.curdsample.models;

import javax.persistence.*;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long addressId;
	private String houseName;
	private String street;

	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "cityId")
	@PrimaryKeyJoinColumn
	private Citys city;

	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	//@JoinColumn(name = "stateId")
	private States state;

	public Address() {

	}

	public Address(Long addressId, String houseName, String street, Citys city, States state) {
		super();
		this.addressId = addressId;
		this.houseName = houseName;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	public Long getId() {
		return addressId;
	}

	public void setId(Long addressId) {
		this.addressId = addressId;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Citys getCity() {
		return city;
	}

	public void setCity(Citys city) {
		this.city = city;
	}

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", houseName=" + houseName + ", street=" + street + "]";
	}

}
