package com.info.patterns;

public class reverseLeftTriangleNumbers {
	public static void main(String[] args) {
		
		int n=4;
		int number =10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(number+" ");
				number--;
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}

}
