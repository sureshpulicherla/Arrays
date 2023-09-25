package com.kn.Sorting;

import java.util.Scanner;

public class InsertionSortingDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int arr[] = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element "+(i+1)+" value");
			arr[i] = scan.nextInt();
		}
		
		InsertionSorting in = new  InsertionSorting();
		int crr[] = in.sorting(arr);
		for(int i : crr) {
			System.out.print(i+" ");
		}
		scan.close();
		
	}

}
