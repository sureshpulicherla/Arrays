package com.kn.Sorting;

import java.util.Scanner;

public class SelectionSorting {

	public static void main(String[] args) {
		Scanner scan  =new Scanner(System.in);
		System.out.println("Enter the Array Size : ");
		int arr[] = new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the array element "+(i+1)+" value");
			arr[i] = scan.nextInt();
		}
		SelectionSortingLogic s = new SelectionSortingLogic();
		
		int brr[]  = s.selctionSort(arr);
		for(int i:brr) {
			System.out.print(i+" ");
		}
		scan.close();
	}

}
