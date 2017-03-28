package model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Employee;
import entity.EntityManagerHelper;

public class EmployeeDAO {
	
	EntityManager manager = EntityManagerHelper.getEntityManager();
	public List<Employee> getAllEmployees()
	{
		 Query query =  manager.createQuery("select e from Employee e");
		 return query.getResultList();
	}

	public List<Employee> getAllEmployeesBySalary(BigDecimal sal)
	{
		 Query query =  manager.createQuery("select e from Employee e where e.salary = :sal");
		 query.setParameter("sal", sal);
		 return query.getResultList();
	}
	
	public List<Employee> getAllEmployeesByEmployeeId(BigDecimal eid)
	{
		 Query query =  manager.createQuery("select e from Employee e where e.employeeId = :eid");
		 query.setParameter("eid", eid);
		 return query.getResultList();
	}
	
	public List<Employee> getAllEmployeesByDepId(BigDecimal deptid)
	{
		 Query query =  manager.createQuery("select e from Employee e where e.departmentId = :deptid");
		 query.setParameter("deptid", deptid);
		 return query.getResultList();
	}
	
	public List<Employee> getAllEmployeesByManagerId(BigDecimal eid)
	{
		 Query query =  manager.createQuery("select e from Employee e where e.managerId = (select e1.managerId from Employee e1 where e1.employeeId = :eid) " );
		 query.setParameter("eid", eid);
		// query.setParameter("jid", jid);
		 return query.getResultList();
	}
	
	public boolean insertEmployees(Employee emp)
	{
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();
		return true;
	}
	
	public boolean updateEmployees(Employee emp)
	{
		manager.getTransaction().begin();
		manager.merge(emp);
		manager.getTransaction().commit();
		return true;
	}
	
	public boolean deleteEmployees(Employee emp)
	{
		manager.getTransaction().begin();
		System.out.println(manager.contains(emp));
		if(manager.contains(emp))
		manager.remove(emp);
		manager.getTransaction().commit();
		return true;
	}
}
