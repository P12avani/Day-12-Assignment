package com.codegnan.arrays;

public class MatrixMultiplication {

	public static void main(String[] args) {
		        int[][] A = { {1, 2, 3}, {4, 5, 6} };
		        int[][] B = { {7, 8}, {9, 10}, {11, 12} };

		        int rowsA = 2, colsA = 3;
		        int rowsB = 3, colsB = 2;

		        // Result matrix
		        int[][] C = new int[rowsA][colsB];

		        // Multiplication logic
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                for (int k = 0; k < colsA; k++) {
		                    C[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        // Display result
		        System.out.println("Product of two matrices:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                System.out.print(C[i][j] + " ");
		            }
		            System.out.println();
		        }
		    
		}

	}


