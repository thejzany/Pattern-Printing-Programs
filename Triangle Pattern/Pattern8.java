Pattern8:
5
54
543
5432
54321

package com.jsp.trianglepattern;

public class Pattern8 {
	public static void main(String[] args){
		int n=5;
		for(int i=n;i>=1;i--){
			for(int j=n; j>=i; j--){
				System.out.print(j);
				}
			System.out.println();
		}
		}
	}