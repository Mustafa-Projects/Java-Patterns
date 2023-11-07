package com.info.patterns;

public class leftTriangleNumbers {
	public static void main(String[] args) {
		int n=4;
		int number =1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");	
			}
			
			System.out.println();
		
			
		}
	}

}
