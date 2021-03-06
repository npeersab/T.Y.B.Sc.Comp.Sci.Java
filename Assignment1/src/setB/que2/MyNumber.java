package setB.que2;

public class MyNumber {
	private int number;
	
	// default constructor
	MyNumber() { 
		number = 0;
	}

	// parameterized constructor
	MyNumber(int num) {
		this.number = num;
	}

	// return true if number is negative
	public boolean isNegative() {
		return number < 0;
	}

	// return true if number is positive
	public boolean isPositive() {
		return number > 0;
	}

	// return true only if number is zero
	public boolean isZero() {
		return number == 0;
	}

	// return true if number is odd
	public boolean isOdd() {
		return number % 2 != 0;
	}

	// return true if number is even
	public boolean isEven() {
		return number % 2 == 0;
	}
	
	public static void main(String args[]) {
		if (args.length > 0) {
			MyNumber num1 = new MyNumber(Integer.parseInt(args[0]));
			System.out.println(Integer.parseInt(args[0]));

			if (num1.isNegative())
				System.out.println("Number is negative");
			if (num1.isPositive())
				System.out.println("Number is positive");
			if (num1.isZero())
				System.out.println("Number is zero");
			if (num1.isEven())
				System.out.println("Number is even");
			if (num1.isOdd())
				System.out.println("Number is odd");
		}
		// if user does not provide argument
		else 
			System.out.println("Insufficient arguments");
	}
}
