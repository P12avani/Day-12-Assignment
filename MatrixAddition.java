package com.codegnan.arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		        int rows = 2, cols = 3;

		        // Matrices A and B
		        int[][] A = { {1, 2, 3}, {4, 5, 6} };
		        int[][] B = { {7, 8, 9}, {1, 2, 3} };

		        // Result matrix
		        int[][] C = new int[rows][cols];

		        // Addition logic
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                C[i][j] = A[i][j] + B[i][j];
		            }
		        }

		        // Display the result
		        System.out.println("Sum of two matrices:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }
		    
		}


	}


