package com.csdn.osgi.domain;

public class Company {

	private String name; // 公司名称

	private Employee emp; // 假设只有一个员工

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Company() {
		System.out.println("=========Company=========");
	}

}
