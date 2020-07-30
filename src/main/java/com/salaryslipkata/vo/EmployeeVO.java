package com.salaryslipkata.vo;

public class EmployeeVO {
	private int id;
	private String name;
	private float annualSalary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getAnnualSalary() {
		return annualSalary;
	}


	public void setAnnualSalary(float annualSalary) {
		this.annualSalary = annualSalary;
	}


	@Override
	public String toString() {
		return "EmployeeVO [id=" + id + ", name=" + name + ", annualSalary=" + annualSalary + "]";
	}
	
}
