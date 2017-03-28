package model.test;

import java.util.List;

import entity.AccountJoined;
import model.dao.AccountJoinedDAO;

public class AccountJoinedDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountJoinedDAO dao = new AccountJoinedDAO();
		List<AccountJoined> accountList = dao.getAccountDetails();
		for (AccountJoined account : accountList) {
			System.out.println(account.toString());
		}
		
	}

}
