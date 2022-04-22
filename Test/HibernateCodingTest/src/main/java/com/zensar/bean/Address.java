package com.zensar.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int addressId;
	@Column
	String cityName;
	@Column
	String pincode;

	@OneToOne
	@MapsId
	@JoinColumn(name = "EMPID")
	Employee employee;

	public Address(int addressId, String cityName, String pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(String cityName, String pincode, Employee employee) {
		super();
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}

	public Address() {
		super();
// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", pincode=" + pincode + ", employee="
				+ employee + "]";
	}

}