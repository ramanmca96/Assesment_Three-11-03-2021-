package com.StringPrograms;

public class StringBuilderProgram {

	public static void main(String[] args) {
		appendMethod();
		insertMethod();
		deleteMethods(); 
		reverse();
	}
	private static void appendMethod() {
		StringBuilder sb=new StringBuilder("Hello");  
		sb.append("Java");
		System.out.println(sb);
		}
	
	private static void insertMethod() {
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.insert(1,"Java");
		System.out.println(sb);
		}  
	
	private static void deleteMethods() {
		StringBuilder sb=new StringBuilder("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);
	}
	
	private static  void reverse() {
		StringBuilder sb=new StringBuilder("Hello");  
		sb.reverse();  
		System.out.println(sb);
	}
	}
	

