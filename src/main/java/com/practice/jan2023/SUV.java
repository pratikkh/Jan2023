package com.practice.jan2023;

public class SUV implements Vehicle, Car, Cloneable{

	public String color;
	public String noOfGears;
	public Person owner;
	public SUV getCurrentObject() {
		System.out.println("SUV get method");
		return this;
	}
	
	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPassengerCapacity() {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public SUV clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		SUV  s =(SUV)super.clone();
		Person p = new Person ();
		p.name = this.owner.name;
		s.owner= p;
		return s;
	}
	

}
