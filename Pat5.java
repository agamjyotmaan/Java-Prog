package java1.loops;

import java.util.Scanner;

public class Pat5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the length: ");
		int n=sc.nextInt();
		System.out.println("Enter the breath: ");
		int m=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
