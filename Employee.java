package com.example.EmployeeRegisterLoginOperations.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Column(name="name")
	String name;
	@Column(name="dob")
	String dob;
	@Column(name="gender")
	String gender;
	@Column(name="address")
	String address;
	@Column(name="city")
	String city;
	@Column(name="state")
	String state;
	@Id
	@Column(name="login_id")
	int login_id;
	@Column(name="password")
	String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Employee(String name, String dob, String gender, String address, String city, String state, int login_id,
			String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.state = state;
		this.login_id = login_id;
		this.password = password;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", city="
				+ city + ", state=" + state + ", login_id=" + login_id + ", password=" + password + "]";}
		
	
	
	

}
