package com.baselogin;

public class TestingCinstructor {
	
	 String a;
	 String name;
	//interface = class like structure 
	//Contractor = method like structure
	//rule = 1) name same as class name 2) never use void word, bcz constructor always return something
	//why = to remove default value , specially null
	 //type = parameterize & non parameterize
	 
	// where to use overloading ?method, constructor
	// class == Big zero 
	public TestingCinstructor(String a,String name){
		this.a=a;
		this.name=name;
		
	}
	public TestingCinstructor(){
	
		
	}

	public void getname() {

		System.out.println(a.concat(name));
	}
	
	public static void main(String[] args) {
		TestingCinstructor obj = new TestingCinstructor("APPL","HP");//Constructor 
		obj.getname();
		
	}

}
