package entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CURRENTNO")
public class CurrentNO extends AccountNO {
	public CurrentNO(Integer accId, String h_Name, Double balance,Double od_Limit) {
		super(accId, h_Name, balance);
		// TODO Auto-generated constructor stub
		this.od_Limit = od_Limit;
	}

	public CurrentNO() {
		// TODO Auto-generated constructor stub
	}

	private Double od_Limit;

	public Double getOd_Limit() {
		return od_Limit;
	}

	public void setOd_Limit(Double od_Limit) {
		this.od_Limit = od_Limit;
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		return "CurrentNO [" + (od_Limit != null ? "od_Limit=" + od_Limit : "") + "]";
	}

	

}
