package model.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import entity.Employee;
import entity.EmployeeNO;
import model.dao.EmployeeDAO;
import model.dao.EmployeeNODAO;

public class EmployeeNODAOTest {

	EmployeeNODAO dao = new EmployeeNODAO();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new EmployeeNODAOTest().fetchAllEmployees();
		//new EmployeeDAOTest().insertEmployee();
		new EmployeeNODAOTest().updateEmployee();
	}
	
	
	public void fetchAllEmployees()
	{
		List<EmployeeNO> empList = dao.getAllEmployeesByManagerId(new BigDecimal(106));
		for (EmployeeNO  empStr: empList) {
			System.out.println(empStr.toString());
		}
	}
	
	public void insertEmployee(){
		EmployeeNO emp = new EmployeeNO();
		emp.setEmployee_Id(211);
		emp.setFirstName("Aarti");
		emp.setLastName("Tanwani");
		emp.setEmail("aartitanwa");
		emp.setPhoneNumber("515.123.8186");
		emp.setHireDate(new Date());
		emp.setJobId("AD_VP");
		emp.setSalary(new BigDecimal(19000.0));
		emp.setCommissionPct(new BigDecimal(0.01));
		emp.setDepartmentId(new BigDecimal(90));
		emp.setManagerId(new BigDecimal(102));
		dao.insertEmployees(emp);
	}
	
	public void updateEmployee(){
		EmployeeNO emp = new EmployeeNO();
		emp.setEmployee_Id(211);
		emp.setFirstName("Aarti");
		emp.setLastName("Tanwani");
		emp.setEmail("aartitanwani");
		emp.setPhoneNumber("515.123.8186");
		emp.setHireDate(new Date());
		emp.setJobId("AD_VP");
		emp.setSalary(new BigDecimal(19000.0));
		emp.setCommissionPct(new BigDecimal(0.01));
		emp.setDepartmentId(new BigDecimal(90));
		emp.setManagerId(new BigDecimal(102));
		dao.updateEmployees(emp);
	}

}
