package java1.loops;

import java.util.Scanner;

public class Pat16 {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the n: ");
		int n=sc.nextInt();
		//upper triangle
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	    //@line1	
		for (int i=1;i<=n;i++) {
			System.out.print("@ ");
		}
		System.out.println();
		
		//diamond
		for(int i=1;i<=n/2;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("e");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=2;j<=i;j++) {
				if(j==i) {
					System.out.print("e");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=(n/2)-1;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print("e");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=2;j<=i;j++) {
				if(j==i) {
					System.out.print("e");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//@line
		for (int i=1;i<=n;i++) {
			System.out.print("@ ");
		}
		System.out.println();
		
		//Lower triangle
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
