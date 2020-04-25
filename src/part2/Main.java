package part2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//Part1
		Scanner sc = new Scanner(System.in);
		long fig;
		System.out.println("Enter number to be converted to words: ");
		fig = sc.nextLong();
		FigWords.figToWords(fig);
		
		
		//Part 2
		KeyRead_Line2 keyRead = new KeyRead_Line2();
		keyRead.read();
		keyRead.display();
		keyRead.sort();
		int d;
		System.out.println("Enter number to serch for in array:  ");
		d = sc.nextInt();
		keyRead.find(d);
		
		
		//Part3
		int length = args.length;
		int[] num = new int[length];
		for(int i=0; i<length; i++) {
			num[i] = Integer.parseInt(args[i]);
		}
		Command_Line1.calData(num);
		Command_Line1.displayData();
		
	}

}
