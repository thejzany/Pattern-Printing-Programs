Pattern6:
1
21
321
4321
54321

package com.jsp.trianglepattern;

public class Pattern6 {
	public static void main(String[] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i; j>=1; j--){
				System.out.print(j);
				}
			System.out.println();
		}
		}
	}