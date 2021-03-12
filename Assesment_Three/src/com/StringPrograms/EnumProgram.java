package com.StringPrograms;
enum type{
	PETROL,DIESAL,BATTERY
}

public class EnumProgram {

		public static void main(String[] args) {
			type t = type.BATTERY;
			switch(t) {
			case PETROL:
				System.out.println("High price");
				break;
			case DIESAL:
				System.out.println("Somewhat equal to petrol price");
				break;
			case BATTERY:
				System.out.println("Low price and Ecofriendly");
				break;
				
			}

		}

	}

