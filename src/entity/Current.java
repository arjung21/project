package entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "C")
public class Current extends Account {

	@Column(name="OD_LIMIT")
	private double overDraftLimit;

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	public Current() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Current [overDraftLimit=" + overDraftLimit + "]";
	}
	
	
}
