package com.csdn.osgi.domain;

public class Programmer implements Employee{
	
	private String name; // 员工姓名

	private int age; // 员工年龄

	private String address; // 居住地址

	private double salary; // 员工薪资

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
