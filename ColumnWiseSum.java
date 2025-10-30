package com.codegnan.arrays;

import java.util.Scanner;

public class ColumnWiseSum {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
        Scanner sc = new Scanner(System.in);

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Read elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nColumn-wise sum:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }

        sc.close();
    }

	}


