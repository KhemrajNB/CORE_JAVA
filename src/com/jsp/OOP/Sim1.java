package com.jsp.OOP;

public class Sim1 {
	private String service_provider;
	private String type;
	private long cno;
	
	public Sim1(String service_provider,String type, long cno) {
		this.service_provider = service_provider;
		this.type = type;
		this.cno = cno;
	}
	
	public String getServiceProvider() {
		return service_provider;
	}
	public void setServiceProvider(String service_provider) {
		this.service_provider = service_provider;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public double getCno() {
		return cno;
	}
	public void setCno(long cno) {
		this.cno = cno;
	}
	
	
	public void printSim1() {
		System.out.println("======Sim1======");
		System.out.println(service_provider);
		System.out.println(type);
		System.out.println(cno);
	}
	
}
