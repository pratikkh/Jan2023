package com.practice.jan2023;

//public class App {
class A {
	A get() {
		return this;
	}
}

class B1 extends A {
	@Override
	B1 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to modified covariant return type");
	}

	public static void main(String args[]) {
		
		 String s1="Sachin";  
		   String s2="Sachin";  
		   String s3="Ratan";  
		   if(s1.compareTo(s2) != 0 )
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)  
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  

		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )  
		


	}
}

// }}
