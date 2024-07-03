package com.springcore.constructorinjection;

public class Person {
	private String name;
	private int personID ;
	private Certificate certi;
	
	public Person(String name,int personID,Certificate certi)
	{
		this.name=name;
		this.personID=personID;
		this.certi=certi;
	}

	@Override
	public String toString() {
		return this.name+" : "+this.personID+" { "+ this.certi.name+" } ";
	}
	
}
