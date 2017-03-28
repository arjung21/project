package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ACCOUNTNO database table.
 * 
 */
@Entity
@Table(name="ACCOUNTNO")
@NamedQuery(name="Accountno.findAll", query="SELECT a FROM Accountno a where a.accid = :aid")
public class Accountno implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private long accid;

	@Column(precision=10, scale=2)
	private BigDecimal balance;

	@Column(name="H_NAME", length=25)
	private String hName;

	public Accountno() {
	}

	public long getAccid() {
		return this.accid;
	}

	public void setAccid(long accid) {
		this.accid = accid;
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getHName() {
		return this.hName;
	}

	public void setHName(String hName) {
		this.hName = hName;
	}

	@Override
	public String toString() {
		return "Accountno [accid=" + accid + ", " + (balance != null ? "balance=" + balance + ", " : "")
				+ (hName != null ? "hName=" + hName : "") + "]";
	}

}