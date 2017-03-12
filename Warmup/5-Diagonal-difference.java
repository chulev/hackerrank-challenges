import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long firstDiagonalSum = 0L, secondDiagonalSum = 0L;
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                matrix[i][j] = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            firstDiagonalSum += matrix[i][i];
            secondDiagonalSum += matrix[i][n - i - 1];
        }
        
        System.out.println(Math.abs(firstDiagonalSum - secondDiagonalSum));
    }
}