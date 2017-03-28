package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="SAVINGS")
@PrimaryKeyJoinColumn(name="ACCID")
@DiscriminatorValue("1")
public class SavingsJoined extends AccountJoined {
	
	private double minBal;

	public double getMinBal() {
		return minBal;
	}

	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "SavingsJoined [minBal=" + minBal + "]";
	}

	public SavingsJoined() {
		// TODO Auto-generated constructor stub
	}
	
}
