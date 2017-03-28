package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.Account;
import entity.AccountNO;
import entity.EntityManagerHelper;

public class AccountNODAO {

	EntityManager manager = EntityManagerHelper.getEntityManager();
	public List<AccountNO> getAccountDetails()
	{
		Query query = manager.createQuery("select a from AccountNO a");
		return query.getResultList();
		
	}
	
}
