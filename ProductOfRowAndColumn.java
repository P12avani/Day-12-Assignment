package com.codegnan.arrays;

public class ProductOfRowAndColumn {

	public static void main(String[] args) {
		        int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int rows = matrix.length;
		        int cols = matrix[0].length;

		        // Row-wise product
		        System.out.println("Row-wise Product:");
		        for (int i = 0; i < rows; i++) {
		            int product = 1;
		            for (int j = 0; j < cols; j++) {
		                product *= matrix[i][j];
		            }
		            System.out.println("Row " + (i + 1) + " = " + product);
		        }

		        // Column-wise product
		        System.out.println("\nColumn-wise Product:");
		        for (int j = 0; j < cols; j++) {
		            int product = 1;
		            for (int i = 0; i < rows; i++) {
		                product *= matrix[i][j];
		            }
		            System.out.println("Column " + (j + 1) + " = " + product);
		        }
		    
		}

	}


