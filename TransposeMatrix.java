package com.codegnan.arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		        int rows = 2, cols = 3;
		        int[][] matrix = { {1, 2, 3}, {4, 5, 6} };
		        int[][] transpose = new int[cols][rows];

		        // Transpose logic
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                transpose[j][i] = matrix[i][j];
		            }
		        }

		        // Display transpose
		        System.out.println("Transpose of the matrix:");
		        for (int i = 0; i < cols; i++) {
		            for (int j = 0; j < rows; j++) {
		                System.out.print(transpose[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		


	}


