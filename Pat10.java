package java1.loops;

import java.util.Scanner;

public class Pat10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		int m=n;
		for(int i=1;i<=n;i++) {
			for(int x=m;x>1;x--) {
				System.out.print(" ");
			}
			m--;
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
