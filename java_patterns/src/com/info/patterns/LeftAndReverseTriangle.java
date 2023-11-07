package com.info.patterns;

public class LeftAndReverseTriangle {	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int o=4;
		for(int i=1;i<=o;i++) {
			for(int j=i;j<=o;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
	
	}

}
