 package com.kn.Sorting;

public class BubbleSort {
	
	public int[] sort(int arr[]){
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
 					arr[j] = arr[j+1];
					arr[j+1]=temp;
					count=1;
				}
			}if(count==0)
				break;
		}
		return arr;
		
	}

}
