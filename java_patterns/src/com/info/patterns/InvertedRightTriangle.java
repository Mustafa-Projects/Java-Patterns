package com.info.patterns;

public class InvertedRightTriangle {
	public static void main(String[] args) {
		
		int n=8;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
