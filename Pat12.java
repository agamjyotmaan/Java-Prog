package java1.loops;

import java.util.Scanner;

public class Pat12 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1|i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=2;j<=i;j++) {
				if(j==i|i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
