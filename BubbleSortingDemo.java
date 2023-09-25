package com.kn.Sorting;

import java.util.Scanner;

public class BubbleSortingDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int arr[] = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array element "+(i+1)+" value");
			arr[i] = scan.nextInt();
		}
		
		
		BubbleSort b = new BubbleSort();
		int crr[] = b.sort(arr);
		for(int i : crr)
			System.out.print(i+" ");
		
		scan.close();
	}

}
