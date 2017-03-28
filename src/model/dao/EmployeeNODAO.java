package model.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.EmployeeNO;
import entity.EntityManagerHelper;

public class EmployeeNODAO {
	
	EntityManager manager = EntityManagerHelper.getEntityManager();
	public List<EmployeeNO> getAllEmployees()
	{
		 Query query =  manager.createQuery("select e from EmployeeNO e");
		 return query.getResultList();
	}

	public List<EmployeeNO> getAllEmployeesBySalary(BigDecimal sal)
	{
		 Query query =  manager.createQuery("select e from EmployeeNO e where e.salary = :sal");
		 query.setParameter("sal", sal);
		 return query.getResultList();
	}
	
	public List<EmployeeNO> getAllEmployeesByDepId(BigDecimal deptid)
	{
		 Query query =  manager.createQuery("select e from EmployeeNO e where e.departmentId = :deptid");
		 query.setParameter("deptid", deptid);
		 return query.getResultList();
	}
	
	public List<EmployeeNO> getAllEmployeesByManagerId(BigDecimal eid)
	{
		 Query query =  manager.createQuery("select e from EmployeeNO e where e.employeeId = (select e1.managerId from EmployeeNO e1 where e1.employeeId = :eid) " );
		 query.setParameter("eid", eid);
		// query.setParameter("jid", jid);
		 return query.getResultList();
	}
	
	public boolean insertEmployees(EmployeeNO emp)
	{
		manager.getTransaction().begin();
		manager.persist(emp);
		manager.getTransaction().commit();
		return true;
	}
	
	public boolean updateEmployees(EmployeeNO emp)
	{
		manager.getTransaction().begin();
		manager.merge(emp);
		manager.getTransaction().commit();
		return true;
	}
	
	public boolean deleteEmployees(EmployeeNO emp)
	{
		manager.getTransaction().begin();
		manager.remove(emp);
		manager.getTransaction().commit();
		return true;
	}
}
