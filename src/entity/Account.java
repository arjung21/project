package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Account
 *
 */
// This is  my second commit.
// another commit - see differnece.
@Entity
@Table (name = "ACCOUNT") 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "ACC_TYPE")
public class Account implements Serializable {

	
	@Override
	public String toString() {
		return "Account [" + (accId != null ? "accId=" + accId + ", " : "")
				+ (name != null ? "name=" + name + ", " : "") + "balance=" + balance + "]";
	}
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name = "ACCID")
	private String accId;
	@Column(name = "H_NAME")
	private String name;
	private double balance;
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account() {
		//super();
	}
   
  
}
