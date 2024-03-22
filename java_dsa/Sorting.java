package java_dsa;

import java.util.Scanner;

public class Sorting {
	
	public static void bubble_sort(int arr[], int n) {
		for (int i = 0; i<n-1; i++) {
			for (int j = 0; j<n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					// Swapped
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void selection_sort(int arr[],int n) {
		int min_index = 0;
		for (int i = 0; i<n-1; i++) {
			min_index = i;
			for(int j = i+1; j<n; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;	
		}
		
	}
	
	public static void insertion_sort(int arr[], int n) {
		for(int i = 1; i<n; i++) {
			int j = i-1;
			int temp = arr[i];
			while(j >= 0 && temp < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static int[] merge_sort(int arr2[], int  arr3[]) {
		int newArr[] = new int[arr2.length + arr3.length];
		int i = 0; 
		int j = 0;
		int k = 0;
		
		while (i < arr2.length && j < arr3.length) {
			if (arr2[i] < arr3[j]) {
				newArr[k] = arr2[i];
				i++;
				k++;
			}
			else {
				newArr[k] = arr3[j];
				j++;
				k++;
			}
		}
		
		while(i < arr2.length) {
			newArr[k] = arr2[i];
			i++;
			k++;
		}
		
		while(j < arr3.length) {
			newArr[k] = arr3[j];
			j++;
			k++;
		}	
		return newArr;
	}
	
	public static void printMergeArr(int arr[]){
	     for (int i = 0; i<arr.length; i++){
	          System.out.print(arr[i] + " ");
	      }
	     System.out.println();
	  }
	
	public static void print(int[]arr, int n) {
		System.out.println("sorted:");
		for (int i = 0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		// This is to check bubble, selection, insertion sort 
		int arr[] = {5,4,3,2,1};
		int n = arr.length;
		
		// This is created for merge sort...sorted arrays
		int arr2[] = {2, 3, 10, 12, 23};
		int arr3[] = {1, 3, 5, 9};
		int choice = 0;
		
		do {
			System.out.println("Enter 1 to use Bubble sort");
			System.out.println("Enter 2 to use Selection sort");
			System.out.println("Enter 3 to use Insertion sort");
			System.out.println("Enter 4 to use Merge sort");
			System.out.println("Enter 5 to exit menu");
			System.out.println("Enter your choice:");
			
			choice = s.nextInt();
			switch(choice) {
			case 1:
				bubble_sort(arr,n);
				print(arr,n);
				break;
				
			case 2:
				selection_sort(arr,n);
				print(arr,n);
				break;
				
			case 3:
				insertion_sort(arr,n);
				print(arr,n);
				break;
			
			case 4:
				int ans[] = merge_sort(arr2,arr3);
			    printMergeArr(ans);
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("Invalid choice");
				break;
			}
			
		}while(choice != 5);
	}
}
