package com.info.patterns;

public class HexaStar {
	public static void main(String[] args) {
		
		System.out.println("                    *");
		System.out.println();
		
			for(int j=1;j<=5;j++) {
				if(j%2 == 0) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			System.out.println();
			
			for(int j=1;j<=5;j++) {
				if(j%2 == 0) {
					System.out.print(" ");	
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
			System.out.println();
			for(int j=1;j<=5;j++) {
				if(j%2 == 0) {
					System.out.print("* ");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			System.out.println("                    *");
		}
	}


