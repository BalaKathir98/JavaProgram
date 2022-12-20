package com.array;

import java.util.Scanner;

public class Arraydup2 {
	public static void main(String[] nn) {

		
		System.out.println("Enter the no. of rows :");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		System.out.println("Enter the coloumns :");
		int col = sc.nextInt();

		int a[][] = new int[row][col];
		System.out.println("Enter the values :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();

			}
		}

		System.out.println("2d array");
		System.out.println();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
