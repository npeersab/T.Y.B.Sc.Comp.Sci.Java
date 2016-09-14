import java.util.Scanner;
import Series.*;

class Number {

	public static void main(String args[]) {

		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter limit for series : ");
		int n = ip.nextInt();

		System.out.println("\nPrime numbers :");
		Prime.displayPrime(n);
		System.out.println("\nFibonacci Series :");
		Fibonacci.displayFibonacci(n);
		System.out.println("\nSquare number :");
		Square.displaySquare(n);
		System.out.println();
	}
}