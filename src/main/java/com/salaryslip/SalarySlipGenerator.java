package com.salaryslip;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.salaryslip.vo.Employee;
import com.salaryslip.vo.SalarySlip;

public class SalarySlipGenerator {

	final BigDecimal TWELVE = new BigDecimal(12);
	public SalarySlip getSalarySlip(Employee employee) {
		
		SalarySlip salarySlip = new SalarySlip();
		salarySlip.setEmployeeId(employee.getId());
		salarySlip.setEmployeeName(employee.getName());
		salarySlip.setGrossSalary(grossSalaryCalculator(employee.getAnnualSalary()));
		salarySlip.setnIC(nICCalculator(employee.getAnnualSalary()));
		
		return salarySlip;
	}

	private BigDecimal nICCalculator(BigDecimal annualSalary) {
		BigDecimal nicELigibleAmount =  annualSalary.subtract(new BigDecimal(8060)).divide(TWELVE,2, RoundingMode.HALF_UP);
		 return nicELigibleAmount.multiply(TWELVE).divide(new BigDecimal(100),2, RoundingMode.HALF_UP);
	}

	private BigDecimal grossSalaryCalculator(BigDecimal annualSalary) {
		BigDecimal bd = annualSalary.divide((new BigDecimal(12)),2, RoundingMode.HALF_UP);
		
		return bd;
		
	}

}
