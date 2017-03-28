package model.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.AccountNO;
import model.Accountno;

public class NamedQueryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence persist = new Persistence();
		EntityManagerFactory factory = persist.createEntityManagerFactory("FisrtJPA");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("Accountno.findAll");
		
		//manager.createQuery(arg0)
		List<Accountno> accList = query.getResultList();
		for (Accountno accountno : accList) {
			System.out.println(accountno.toString());
		}
				
	}

}
