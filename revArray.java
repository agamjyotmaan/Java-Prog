package java1.array;

import java.util.*;

public class revArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the size of array: ");
		int n=sc.nextInt();
		int[]arr=new int [n];
		for(int i=0;i<n;i++) {
			System.out.println(i+1+" value:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Before reverse: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("After reverse: ");
		for(int i=n-1;i>=0;i--) {
			System.out.print(arr[i]+",");
		}
		sc.close();
	}
}
