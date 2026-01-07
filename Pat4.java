package java1.loops;

import java.util.Scanner;

public class Pat4 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int x=1;x<=i;x++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
