import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int checkAlice(int a, int b) {
        return (a > b) ? 1 : 0;
    }
    
    public static int checkBob(int a, int b) {
        return (a < b) ? 1 : 0;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int aliceScore = checkAlice(a0, b0) + checkAlice(a1, b1) + checkAlice(a2, b2);
        int bobScore = checkBob(a0, b0) + checkBob(a1, b1) + checkBob(a2, b2);

        System.out.println(aliceScore + " " + bobScore);
    }
}