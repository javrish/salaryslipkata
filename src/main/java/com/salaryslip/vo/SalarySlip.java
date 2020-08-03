package com.salaryslip.vo;

import java.math.BigDecimal;

public class SalarySlip {
	private int employeeId;
	private String employeeName;
	private BigDecimal grossSalary;
	private BigDecimal nIC;
	
	public BigDecimal getnIC() {
		return nIC;
	}
	public void setnIC(BigDecimal nIC) {
		this.nIC = nIC;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public BigDecimal getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(BigDecimal grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	@Override
	public String toString() {
		return "Employee ID: " + employeeId + "\nEmployee Name: " + employeeName + "\nGross Salary: £"
				+ grossSalary + "\nNational Insurance contributions: £" +nIC;
	}
}
