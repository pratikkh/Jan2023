package com.practice.jan2023;
/**
 * 
 * @author Pratik
 *
 */
class Student {
	static int noOfStudents = 0;
	public static String className;
	private String firstName;
	private String lastName;
	private int rollNumber;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		//authentication
		//if (currentUSer == Owner || currentUser == Support)
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	
	public Student(){
		System.out.println("Creating Object!");
		noOfStudents++;
	}
	public Student(String firstName, String lastName, int rollNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}
	
	
	void printStudentsDetails() {
		System.out.println("Name = " + firstName + " " + this.lastName + "rollNumber :" + this.rollNumber);
	}
	
	
	
	
}