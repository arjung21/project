package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	
	private static EntityManagerFactory factory = null;
	private static EntityManager manager = null;
	private EntityManagerHelper() {
		
		factory = Persistence.createEntityManagerFactory("jpa_bank");
	}
	
	public static EntityManager getEntityManager() {
		if (factory == null) {
			new EntityManagerHelper();
		} 
		return factory.createEntityManager();
	}
	
}
