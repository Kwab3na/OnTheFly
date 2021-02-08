package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter Row Size: ");
		int Row = myObj.nextInt();

		System.out.print("Enter Column Size: ");
		int Column = myObj.nextInt();

		int[][] numbers = new int[Row][Column];

		for(int i = 0; i < Row; i++) {
			System.out.print("Enter Array Number: ");
			numbers[Row][Column] = myObj.nextInt();
			for(int j = 0; j < Column; j++){2
				System.out.print(numbers[Row][Column] + " ");
			}
		}


	}
}
