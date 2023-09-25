package com.kn.Sorting;

public class SelectionSortingLogic {
	int[] selctionSort(int []arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min = arr[i];
			int index =i;
			for(int j=1+i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					index =j;
				}
			}
			// array swapping
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index]=temp;
			
		}
		 
		return arr;
	}

}
