package model.test;

import java.util.List;

import entity.AccountNO;
import model.dao.AccountNODAO;

public class AccountDAONOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountNODAO dao = new AccountNODAO();
		List<AccountNO> accountList = dao.getAccountDetails();
		for (AccountNO accountNO : accountList) {
			System.out.println(accountNO.toString());
		}
	}

}
