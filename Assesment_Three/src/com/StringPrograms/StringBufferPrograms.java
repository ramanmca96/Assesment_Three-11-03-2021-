package com.StringPrograms;

public class StringBufferPrograms {

		public static void main(String args[]){  
			appendMethod();
			insertMethod();
			 replaceMethod();
			 deleteMethod();
			 stringReverse();
			 
		}
		private static void appendMethod() {
			
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.append("Java");  
			System.out.println(sb);
			}
		private static void insertMethod() {
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.insert(1,"Java");
			System.out.println(sb);
			}  
			
private static void replaceMethod() {
	StringBuffer sb=new StringBuffer("Hello");  
	sb.replace(1,3,"Java");  
	System.out.println(sb);
}
private static void deleteMethod() {
	StringBuffer sb=new StringBuffer("Hello");  
	sb.delete(1,3);  
	System.out.println(sb); 
	}  

private static  void stringReverse() {
	StringBuffer sb=new StringBuffer("Hello");  
	sb.reverse();  
	System.out.println(sb);  
	}  


	
}

		
		
		
		  
	

