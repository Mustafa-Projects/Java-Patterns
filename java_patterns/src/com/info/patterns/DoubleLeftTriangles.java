package com.info.patterns;

public class DoubleLeftTriangles {
		    public static void main(String[] args) {
		        int n = 6;
		        int number =1;
		        for(int i=0;i<=n;i++) {
					for(int j=-n;j<=n;j++) {
						if(-(n-i)<j && j<(n-i)) {
							System.out.print("__");
						}else {
							System.out.print(i +" ");
						}
						
					}
					
					System.out.println();
						
					}
					
		    }
		
	}

