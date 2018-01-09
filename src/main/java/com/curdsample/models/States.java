package com.curdsample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class States {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stateId;

	private String stateName;

	public States() {

	}

	public States(Long stateId, String stateName) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public Long getId() {
		return stateId;
	}

	public void setId(Long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
