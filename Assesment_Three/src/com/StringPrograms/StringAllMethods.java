package com.StringPrograms;

public class StringAllMethods {

	private static void upperCase() {
		// TODO Auto-generated method stub
		String Companyname="VeeTechnology";
		String upperCase = Companyname.toUpperCase();
		System.out.println(upperCase);
	}
	
	private static void lowerCase() {
		// TODO Auto-generated method stub
		String Companyname="VeeTechnology";
		String lowerCase = Companyname.toLowerCase();
		System.out.println(lowerCase);
	}
	public static void main(String[] args) {
		upperCase();
		lowerCase();
		ConcatMethods();
		trimMethods(); 
		equalsIngnoreCaseMethod();
		equalsMethod();
		startWithMethod();
		subStringExample();
		 replaceMethod(); 
		
	}
	
	private static void subStringExample() {
		// TODO Auto-generated method stub
String name="Vee Technology";

	String substring = name.substring(4);
	System.out.println(substring);
	}
	private static  void replaceMethod() {
		// TODO Auto-generated method stub
String name="CavaPrograms";
String o = name.replace('c', 'j');
System.out.println(o);

	}
	private static void ConcatMethods() {
		// TODO Auto-generated method stub
		String firstname="Vee";
		String lastname="Technology";
		
		String concat = firstname.concat(lastname);
		System.out.println(concat);
	}
	
	private static void trimMethods() {
		// TODO Auto-generated method stub
String name="          welcome    to    VeeTechnology";
System.out.println("Before Trim:"+name);
System.out.println("After Trim:"+name.trim());
	}
	
	private void charAtExample() {
		// TODO Auto-generated method stub
		String Companyname="VeeTechnology";
		
		char charAt = Companyname.charAt(5);
		System.out.println(charAt);
	}
	
	private static  void equalsIngnoreCaseMethod() {
		// TODO Auto-generated method stub
String name="RAVANAN";
String name1="ravanan";

boolean equalsIgnoreCase = name.equalsIgnoreCase(name1);
System.out.println(equalsIgnoreCase);
	}
	
	private static void startWithMethod() {
		// TODO Auto-generated method stub
String name ="JavaSpringBoot";
boolean startsWith = name.startsWith("Java");

	System.out.println(startsWith);}
	private static  void equalsMethod() {
		// TODO Auto-generated method stub
String name="RAVANAN";
String name1="ravanan";
boolean equals = name.equals(name1);
System.out.println(equals);
}
}