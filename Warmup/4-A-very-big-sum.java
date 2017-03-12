import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long sum = 0L;

        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }

        System.out.println(sum);
    }
}