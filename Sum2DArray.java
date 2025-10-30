package com.codegnan.arrays;
import java.util.Scanner;
public class Sum2DArray {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        // Input number of rows and columns
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        System.out.print("Enter number of columns: ");
		        int cols = sc.nextInt();

		        int[][] arr = new int[rows][cols];
		        int sum = 0;

		        // Read elements
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                arr[i][j] = sc.nextInt();
		                sum += arr[i][j]; // Add element to sum
		            }
		        }

		        // Print the sum
		        System.out.println("Sum of all elements = " + sum);

		        sc.close();
		    }
		


	}


