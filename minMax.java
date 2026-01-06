package java1.array;

import java.util.Scanner;

public class minMax {
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the size of array: ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println(i+1+" value:");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("ARRAY: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}
		
		int t=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]>t) {
				t=arr[i];
			}
		}
		System.out.println();
		
		System.out.println("Max"+t);
		
		for(int i=1;i<n;i++) {
			if(arr[i]<t) {
				t=arr[i];
			}
		}
		
		System.out.println("Min"+t);
		
		sc.close();
		
	}
}
