package java1.loops;

import java.util.*;

public class Pat1 {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of time u want to print the pattern");
		int n=sc.nextInt(),j=9,s=0;
		
		for(int i=1;i<=n;i++) {
			System.out.print(j+"+");
			s+=j;
			j=(j*10)+9;			
		}
		System.out.print("="+s);
	}
}
