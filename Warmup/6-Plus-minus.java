import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        double[] fractions = new double[3]; 
        
        for (int i = 0; i < n; i++) {
            int next = input.nextInt();
        
            if (next > 0) {
                fractions[0] += 1;
            }
            else if (next < 0) {
                fractions[1] += 1;
            }
            else {
                fractions[2] += 1;
            }
        }
        
        for (int i = 0; i < 3; i++)
            System.out.println(fractions[i] / n);
    }
}