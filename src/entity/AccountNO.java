package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*@Table(name="ACCOUNTNO")*/
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class AccountNO {

	@Override
	public String toString() {
		return "AccountNO [" + (accId != null ? "accId=" + accId + ", " : "")
				+ (h_Name != null ? "h_Name=" + h_Name + ", " : "") + (balance != null ? "balance=" + balance : "")
				+ "]";
	}
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private Integer accId;
	public AccountNO() {
		// TODO Auto-generated constructor stub
	}
	private String h_Name;
	private Double balance;
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
	public AccountNO(Integer accId, String h_Name, Double balance) {
		super();
		this.accId = accId;
		this.h_Name = h_Name;
		this.balance = balance;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
}
