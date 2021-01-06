package Arrays;

import java.util.ArrayList;
import java.util.LinkedList;

//Utility class for use with an array of any object type
public class GenericArray {
	
	/**
	 * Static method that searches for a value in the array
	 * @param <Type>: object class of the array
	 * @param arr: the array that is being searched
	 * @param value: the value being searched for in the given array
	 * @return The first index of the value in the array. Returns -1 if the value is not found
	 */
	public static <Type> int searchArray(Type[] arr, Type value) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Sorts the given array 
	 * @param <Type>: object class of the array
	 * @param arr: array being sorted
	 */
	public static <Type extends Comparable<Type>> void sortArray(Type[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i].compareTo(arr[i+1]) > 0) {
				Type temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				i = -1;
			}
		}
	}
	
	/**
	 * Sorts the given array using merge sort
	 * @param <Type>: object class of the array
	 * @param arr: array being sorted
	 */
	public static <Type extends Comparable<Type>> void mergeSort(LinkedList<Type> arr) {
		if(arr.size() > 1) {
			LinkedList<Type> arr1 = new LinkedList<Type>();
			LinkedList<Type> arr2 = new LinkedList<Type>();
			LinkedList<Type> sorted = new LinkedList<Type>();
			
			for(int i = 0; i < arr.size()/2; i++) {
				arr1.add(arr.get(i));
			}
			for(int i = 0; i < arr.size() - arr1.size(); i++) {
				arr2.add(arr.get(i + arr1.size() - 1));
			}
			
			mergeSort(arr1);
			mergeSort(arr2);
			
			while(arr1.size() > 0 && arr2.size() > 0) {
				sorted.add((arr1.get(0).compareTo(arr2.get(0)) > 0) ? arr2.get(0) : arr1.get(0));
			}
		}
	}
	
	/**
	 * Prints out the values of the given array on separate lines
	 * @param <Type>: object class of the array
	 * @param arr: the array being printed
	 */
	public static <Type> void printArray(Type[] arr) {
		for(Type val : arr) {
			System.out.println(val);
		}
		System.out.println();
	}
}
