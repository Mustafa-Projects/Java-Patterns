package com.info.patterns;

public class UpDownStarPattern {
	public static void main(String[] args) {
		int n=2;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=6;j++) {
			if(j%2 == 0) {
				System.out.print(" *"+" ");
			}else {
				System.out.print(" ");
			}
			}
			
			
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=6;j++) {
			if(j%2 == 0) {
				System.out.print(" ");
			}else {
				System.out.print("* "+" ");
			}
			}
			
			
		}
	}

}
