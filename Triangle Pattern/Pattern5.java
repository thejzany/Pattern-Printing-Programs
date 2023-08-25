Pattern5:
1
00
111
0000
11111

package com.jsp.trianglepattern;

public class Pattern5 {
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1; j<=i; j++){
				System.out.print(i%2);
				}
			System.out.println();
		}
		}
	}