package com.info.patterns;

public class SquareStarPattern {
	public static void main(String[] args) {
		int n=10;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=7;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
