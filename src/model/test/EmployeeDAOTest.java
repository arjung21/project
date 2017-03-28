package model.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import entity.Employee;
import model.dao.EmployeeDAO;

public class EmployeeDAOTest {

	EmployeeDAO dao = new EmployeeDAO();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new EmployeeDAOTest().fetchAllEmployees();
		new EmployeeDAOTest().insertEmployee();
		//new EmployeeDAOTest().updateEmployee();
		//new EmployeeDAOTest().deleteEmployee();
	}
	
	
	public void fetchAllEmployees()
	{
		List<Employee> empList = dao.getAllEmployeesByManagerId(new BigDecimal(106));
		for (Employee  empStr: empList) {
			System.out.println(empStr.toString());
		}
	}
	
	public void insertEmployee(){
		Employee emp = new Employee();
		emp.setEmployeeId(211);
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
		Employee emp = new Employee();
		emp.setEmployeeId(211);
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
	
	public void deleteEmployee(){
		Employee emp  = null;
		
		List<Employee> empList = dao.getAllEmployeesByEmployeeId(new BigDecimal(107));
		for (Employee employee : empList) {
			emp = employee;
			System.out.println(emp);
			System.out.println(emp.toString());
		}
		dao.deleteEmployees(emp);
		
		empList = dao.getAllEmployeesByEmployeeId(new BigDecimal(107));
		for (Employee employee : empList) {
			emp = employee;
			System.out.println(emp.toString());
		}
	}
	
	
	

}
