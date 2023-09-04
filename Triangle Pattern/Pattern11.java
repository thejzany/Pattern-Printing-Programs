Pattern11:
*
**
*#*
*##*
*****

package com.jsp.trianglepattern;

public class Pattern11 {
public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++) {
		for (int j=1;j<=i;j++) {
			if(i==1||i==n||j==1||i==j) {
				System.out.print("*");
			}else {
				System.out.print("#");
			}
			
		}
		System.out.println();
	}
}
}