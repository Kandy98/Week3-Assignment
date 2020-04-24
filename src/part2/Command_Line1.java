package part2;

import java.util.Arrays;

public class Command_Line1 {
	private static int sum=0, max, min;
	private static float avg;
	
	public static void setData(int args[]) {
		
	}
	
	public static void calData(int args[]) {
		for(int i=0; i<args.length; i++) {
			sum = sum + args[i];
		}
		
		Arrays.sort(args);
		
		min = args[0];
		max = args[args.length-1];
		avg = sum/args.length;	
	}
	
	public static void displayData() {
		System.out.printf("Sum of arguments is: %d", sum);
		System.out.println();
		System.out.printf("Maximum of arguments is: %d", max);
		System.out.println();
		System.out.printf("Minimum of arguments is: %d", min);
		System.out.println();
		System.out.printf("Average of arguments is: %f", avg);
		System.out.println();
	}
}
