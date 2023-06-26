package com.hibernate.hibernate_OneToOne_uni_direction.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pan {

	@Id
	private int panId;
	private String panAddress;
	private String panNumber;
	
	public int getPanId() {
		return panId;
	}
	public void setPanId(int panId) {
		this.panId = panId;
	}
	public String getPanAddress() {
		return panAddress;
	}
	public void setPanAddress(String panAddress) {
		this.panAddress = panAddress;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	@Override
	public String toString() {
		return "Pan [\npanId=" + panId + ", \npanAddress=" + panAddress + ", \npanNumber=" + panNumber + "]";
	}
	
	
}
