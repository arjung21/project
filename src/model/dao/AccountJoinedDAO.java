package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entity.AccountJoined;
import entity.AccountNO;
import entity.EntityManagerHelper;

public class AccountJoinedDAO {
	EntityManager manager = EntityManagerHelper.getEntityManager();
	public List<AccountJoined> getAccountDetails()
	{
		Query query = manager.createQuery("select a from AccountJoined a");
		return query.getResultList();
		
	}
}
