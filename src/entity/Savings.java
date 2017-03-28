package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import entity.Account;

@Entity
@DiscriminatorValue(value = "S")
public class Savings extends Account {
	@Column(name="MIN_BALANCE")
	private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Savings [minimumBalance=" + minimumBalance + "]";
	}

	

}
