package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SAVING")
public class SavingsNO extends AccountNO {
	public SavingsNO(Integer accId, String h_Name, Double balance,Double minBal) {
		super(accId, h_Name, balance);
		// TODO Auto-generated constructor stub
		this.minBal = minBal;
	}

	public SavingsNO() {
		// TODO Auto-generated constructor stub
	}

	public SavingsNO(Integer accId, String h_Name, Double balance) {
		super(accId, h_Name, balance);
		// TODO Auto-generated constructor stub
	}

	private Double minBal;

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SavingsNO [" + (minBal != null ? "minBal=" + minBal : "") + "]";
	}
	

}
