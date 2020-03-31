package demo;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int input = scan.nextInt();
		scan.close();

		if (input > 1) {
			System.out.print(fib(input - 1) + " + " + fib(input - 2));
		} else {
			System.out.println(1 + " + " + 0);
		}
	}

	public static int fib(int number) {
		if ((number == 0) || (number == 1)) {
			return 1;
		} else {
			return fib(number - 1) + fib(number - 2);
		}
	}
}
