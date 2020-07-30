package com.salaryslip;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.salaryslip.vo.Employee;
import com.salaryslip.vo.SalarySlip;

public class SalarySlipGenerator {

	public SalarySlip getSalarySlip(Employee employee) {
		
		SalarySlip salarySlip = new SalarySlip();
		salarySlip.setEmployeeId(employee.getId());
		salarySlip.setEmployeeName(employee.getName());
		salarySlip.setGrossSalary(grossSalaryCalculator(employee.getAnnualSalary()));
		
		return salarySlip;
	}

	private BigDecimal grossSalaryCalculator(BigDecimal annualSalary) {
		BigDecimal bd = annualSalary.divide((new BigDecimal(12)),2, RoundingMode.HALF_UP);
		
		return bd;
		
	}

}
