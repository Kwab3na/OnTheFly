package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.print("Enter Row Size: ");
		int row = myObj.nextInt();

		System.out.print("Enter Column Size: ");
		int column = myObj.nextInt();

		int[][] numbers = new int[row][column];

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++){
				System.out.print("Enter Row " + (i+1) + " Column " + (j+1) + " data :");
				numbers[i][j] = myObj.nextInt();
			}
		}

		System.out.println();

		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

	}
}
