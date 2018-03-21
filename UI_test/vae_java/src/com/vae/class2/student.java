package com.vae.class2;

public class student {
	public int Sid;
	public String name ;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public student (int a,String y)
	{
		this.Sid=a;
		this.name=y;
	}
}
