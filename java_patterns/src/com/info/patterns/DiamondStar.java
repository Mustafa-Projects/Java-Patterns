package com.info.patterns;

public class DiamondStar {
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int k=1;k<=n-i;k++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		int o=3;
		for(int i=1;i<=o;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=o;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}

}
