package com.nttdata.springboottesting.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

	private String name;
	private UUID idNumber;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(@JsonProperty("name") String name,
					@JsonProperty("id") UUID idNumber) {
		super();
		this.name = name;
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(UUID idNumber) {
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + "]";
	}


}
