Pattern4:
1
10
101
1010
10101

package com.jsp.trianglepattern;

public class Pattern4 {
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1; j<=i; j++){
				System.out.print(j%2);
				}
			System.out.println();
		}
		}
	}