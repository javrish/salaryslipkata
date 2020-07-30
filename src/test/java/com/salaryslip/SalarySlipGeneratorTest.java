package com.salaryslip;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.salaryslip.SalarySlipGenerator;
import com.salaryslip.vo.Employee;
import com.salaryslip.vo.SalarySlip;

@SpringBootTest
class SalarySlipGeneratorTest {
	
	@Test
	void EmployeeGrossSalaryGeneratorTest() {
	SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();
	Employee employee = new Employee();
	
	employee.setId(12345);
	employee.setName("John J Doe");
	employee.setAnnualSalary(new BigDecimal(5000));
	
	SalarySlip salarySlip = salarySlipGenerator.getSalarySlip(employee);
	
	assertEquals("Employee ID: 12345\n" + 
			"Employee Name: John J Doe\n" + 
			"Gross Salary: £416.67", salarySlip.toString());
	
	}
}
