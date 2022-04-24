package com.example.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pinZone")
public class PinZone {
	
	@Id
	@Column (name = "pincode")
	private Integer pincode;
	
	@Column(name = "zone")
	private String zone;
	
	
	public Integer getpincode() {
		return pincode;
	}
	
	public void setpincode(Integer pincode) {
		this.pincode = pincode; 
	}
	
	public String getzone() {
		return zone;
	}
	
	public void setzone(String zone){
		this.zone = zone;
	}
	
	
}
