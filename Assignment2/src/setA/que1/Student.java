package setA.que1;

import java.util.Scanner;

public class Student {
	private int rollNo;
	private String name;
	private float per;
	static int count;

	// default constructor
	Student() {
		incCount();
	}

	// parameterized constructor
	Student(int rn, String nm, float pr) {
		rollNo = rn;
		name = nm;
		per = pr;

		incCount();
	}

	// to increment the counter after each object created
	static void incCount() {
		count++;
		System.out.println(count + " objects created...");
	}

	// display student data
	public static void display(Student student[]) {

		System.out.println("\nStudent Details :");
		printline(43);
		System.out.printf("| Roll No. | %15s | Percentage |\n", "Name");
		printline(43);
		for (int i = 0; i < count; i++)
			System.out.printf("| %8d | %15s | %10.2f |\n",
					student[i].rollNo, student[i].name, student[i].per);
		printline(43);
		System.out.println();
	}

	// print horizontal dotted line
	public static void printline(int n) {
		for (int i = 0; i < n; i++)
			System.out.print('-');
		System.out.println();
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		Student student[] = new Student[50];
		int choice;

		do {
			System.out.print("\n1.Add new Student\n2.View all students\n3.Exit\nEnter option : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 :
				System.out.print("\nEnter roll No : ");
				int r = scanner.nextInt();
				System.out.print("Enter name : ");
				String n = scanner.next();
				System.out.print("Enter percentage : ");
				float f = scanner.nextFloat();

				student[Student.count] = new Student(r, n, f);
				break;

			case 2 :
				Student.display(student);
				break;

			}
		} while (choice != 3);
		scanner.close();
	}
}
