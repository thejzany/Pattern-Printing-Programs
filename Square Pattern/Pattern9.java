Pattern9:
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A  

package com.jsp.squarepattern;

public class Pattern9 {
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=n; j>=1; j--){
				System.out.print((char)(64+j)+" ");
					}
			System.out.println();
			}
			}
	}
