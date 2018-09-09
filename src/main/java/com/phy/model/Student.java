package com.phy.model;

public class Student {
	private Integer Sno;
	private String Sname;
	private int Sage;
	private String Sdept;
	
	public void setSno(Integer Sno){
		this.Sno=Sno;
	}

	public Integer getSno(){
		return this.Sno;
	}
	public void setSname(String Sname){
		this.Sname=Sname;
	}

	public String getSname(){
		return this.Sname;
	}
	public void setSage(int Sage){
		this.Sage=Sage;
	}

	public int getSage(){
		return this.Sage;
	}
	private String Ssex;
	public void setSsex(String Ssex){
		this.Ssex=Ssex;
	}

	public String getSsex(){
		return this.Ssex;
	}
	public void setSdept(String Sdept){
		this.Sdept=Sdept;
	}

	public String getSdept(){
		return this.Sdept;
	}
}
