package model.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence persist = new Persistence();
		EntityManagerFactory factory = persist.createEntityManagerFactory("FisrtJPA");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select e from Employee e");
		List<Employee> empList = query.getResultList();
		for (Employee employee : empList) {
			System.out.println(employee.toString());
		}

		
		Employee emp = new Employee();
		emp.setEmployeeId(210);
		emp.setFirstName("Indiana");
		emp.setLastName("Jones");
		emp.setEmail("indianajon");
		emp.setPhoneNumber("515.123.8185");
		emp.setHireDate(new Date());
		emp.setJobId("AD_VP");
		emp.setSalary(new BigDecimal(17000.0));
		emp.setCommissionPct(new BigDecimal(0.01));
		emp.setDepartmentId(new BigDecimal(90));
		emp.setManagerId(new BigDecimal(102));
		//emp.setEmployee(emp);
		
		Persistence persist1 = new Persistence();
		EntityManagerFactory factory1 = persist.createEntityManagerFactory("FisrtJPA");
		EntityManager manager1 = factory.createEntityManager();
		manager1.getTransaction().begin();
		manager1.persist(emp);
		manager1.getTransaction().commit();
	}

}
