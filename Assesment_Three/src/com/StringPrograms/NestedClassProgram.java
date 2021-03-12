package com.StringPrograms;

class Prev {
	   void simplePrint() {
	      System.out.println("hello");
	   }
	}

	class Next {
	   int x = 10;
	   Prev prev = new Prev() {
	      void simplePrint() {
	         System.out.println("HELLO " + x);
	      }
	   };

	   void print() {
	      prev.simplePrint();
	   }
	}

	public class NestedClassProgram {
	   public static void main(String args[]) {
	      Next next = new Next();
	      Prev prev = new Prev();
	      next.print();
	      prev.simplePrint();
	   }
	}