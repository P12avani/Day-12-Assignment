package com.codegnan.arrays;
import java.util.Scanner;
public class TwoArray {

	public static void main(String[] args) {

		       Scanner sc = new Scanner(System.in);

		        // Read number of rows and columns
		        System.out.print("Enter number of rows: ");
		        int rows = sc.nextInt();

		        System.out.print("Enter number of columns: ");
		        int cols = sc.nextInt();

		        // Declare 2D array
		        int[][] arr = new int[rows][cols];

		        // Read elements
		        System.out.println("Enter elements of the array:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                arr[i][j] = sc.nextInt();
		            }
		        }

		        // Print the 2D array
		        System.out.println("The 2D array is:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(arr[i][j] + " ");
		            }
		            System.out.println(); // move to next line
		        }

		        sc.close();
		    }
		


	}



