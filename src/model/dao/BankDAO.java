package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import entity.Account;
import entity.EntityManagerHelper;

public class BankDAO {
	
	EntityManager manager = EntityManagerHelper.getEntityManager();
	public List<Account> getAccountDetails()
	{
		Query query = manager.createQuery("select a from Savings a");
		return query.getResultList();
		
	}
	

}
