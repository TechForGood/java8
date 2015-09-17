package fun.n.games.java8.hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout
public class Solution010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		double d = sc.nextDouble();
		String s = sc.nextLine();
		s = sc.nextLine();

		// Just printing out.
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		sc.close();
	}
}
