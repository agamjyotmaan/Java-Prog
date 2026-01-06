package java1.loops;

import java.util.Scanner;

public class NaturalNo {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a no. till where natural no. stould print: ");
		int n=in.nextInt(),s=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i+"+");
			s+=i;
		}
		System.out.print("="+s);
		in.close();
	}
}
