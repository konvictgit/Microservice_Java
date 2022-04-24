package com.example.project.payload;

public class Request {
	
	private String zone;
	private float weight;
	private String type;
	
	public Request(String zone, float weight, String type) {
		this.zone = zone;
		this.weight = weight;
		this.type = type;
	}
	
	
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "zone : " + this.zone  + ", weight : " + this.weight + ",type : " + this.type;
	}
	
}

