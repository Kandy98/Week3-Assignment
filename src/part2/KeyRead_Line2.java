package part2;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {

	int n;
	int arr[] = new int[100];
	
	public void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		this.n = sc.nextInt();
		
		System.out.println("Enter elements: ");
		
		for(int i=0; i<n; i++) {
			this.arr[i] = sc.nextInt();
		}
	}
	
	public void display() {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public void sort() {
		Arrays.sort(arr, 0, n);
		System.out.println("Sorted array: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		return;
	}
	
	public void find(int x) {
		for(int i=0; i<n; i++) {
			if(arr[i] == x) {
				System.out.printf("Found %d in given array", x);
				System.out.println();
				return;
			}
		}
		
		System.out.println("Element not found");
	}
	
}
