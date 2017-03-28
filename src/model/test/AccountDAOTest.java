package model.test;

import java.util.List;

import entity.Account;
import entity.Savings;
import model.dao.BankDAO;

public class AccountDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDAO dao = new BankDAO();
		List<Account> accountList = dao.getAccountDetails();
		for (Account account : accountList) {
			System.out.println(account.toString());
		}
		
		List<Account> savingsList = dao.getAccountDetails();
		for (Account account : accountList) {
			//Savings saving = (Savings)account;
			System.out.println(account.toString());
		}
	}

}
