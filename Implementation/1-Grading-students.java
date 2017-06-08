import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private static int nextMultiple(int grade) {
		int nextMultiple;
		for (nextMultiple = grade; nextMultiple < grade + 5; nextMultiple++)
			if (nextMultiple % 5 == 0)
				break;

		return nextMultiple;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int a0 = 0; a0 < n; a0++) {
			int grade = in.nextInt();
			int nextMultiple = nextMultiple(grade);

			if (Math.abs(grade - nextMultiple) < 3 && grade >= 38)
				grade = nextMultiple;

			System.out.println(grade);
		}
	}
}