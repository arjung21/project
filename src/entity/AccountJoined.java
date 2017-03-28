package entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNTNO")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="ACCID")
public abstract class AccountJoined {
	@Override
	public String toString() {
		return "AccountJoined [" + (accId != null ? "accId=" + accId + ", " : "")
				+ (h_Name != null ? "h_Name=" + h_Name + ", " : "") + (balance != null ? "balance=" + balance : "")
				+ "]";
	}
	@Id
	private Integer accId;
	private String h_Name;
	private Double balance;
	
	
	public AccountJoined() {
		// TODO Auto-generated constructor stub
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getH_Name() {
		return h_Name;
	}
	public void setH_Name(String h_Name) {
		this.h_Name = h_Name;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	

}
