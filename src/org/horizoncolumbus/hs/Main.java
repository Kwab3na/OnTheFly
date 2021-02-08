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
			numbers[i][i] = myObj.nextInt();
		}

		for(int j = 0; j < Column; j++){
			System.out.print("Enter Array Number: ");
			numbers[j][j] = myObj.nextInt();
		}

		int sum = 0;

		for(int i = 0; i < Row; i++){
			for(int j = 0; j < Column; j++){
				sum = sum + numbers[i][j];
			}

			System.out.println(sum);
		}
	}
}
