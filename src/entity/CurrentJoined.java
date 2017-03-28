package entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CURRENTS")
@PrimaryKeyJoinColumn(name="ACCID")
@DiscriminatorValue("2")
public class CurrentJoined extends AccountJoined {
	
	public CurrentJoined() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "CurrentJoined [odLimit=" + odLimit + "]";
	}

	private double odLimit;

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}
	

}
