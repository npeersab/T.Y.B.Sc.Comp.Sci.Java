import java.util.Scanner;
import SY.SyMarks;
import TY.TyMarks;

class Student {

	private int rollNo;
	private	String name;
	private	SyMarks syMarks;
	private	TyMarks tyMarks;

	Student(int rno, String nm) {
		
		rollNo = rno;
		name = nm;
	}

	void setSYMarks() {

		Scanner ip = new Scanner(System.in);

		System.out.print("Computer    : ");
		int comp = ip.nextInt();
		System.out.print("Maths       : ");
		int maths = ip.nextInt();
		System.out.print("Electronics : ");
		int elec = ip.nextInt();
		System.out.print("English     : ");
		int en = ip.nextInt();

		syMarks = new SyMarks(comp, maths, elec, en);

	}

	void setTYMarks() {

		Scanner ip = new Scanner(System.in);		

		System.out.print("PHP    : ");
		int php = ip.nextInt();
                System.out.print("Java   : ");
                int java = ip.nextInt();
                System.out.print("OOSE   : ");
                int oose = ip.nextInt();
                System.out.print("CN     : ");
                int cn = ip.nextInt();
                System.out.print("SYSPRO : ");
                int syspro = ip.nextInt();
		System.out.print("TCS    : ");
		int tcs = ip.nextInt();


		tyMarks = new TyMarks(php, java, oose, cn, syspro, tcs);
	}

	public static void display(Student student[]) {

		System.out.println("\nStudent Details :");
		printline(34);
		System.out.printf("| Roll No. | %10s |  Grade |\n", "Name");
		printline(34);
		for(int i = 0; i < student.length; i++)
			System.out.printf("| %8d | %10s | %6s |\n", student[i].rollNo, student[i].name, student[i].getGrade());
		printline(34);

	}

	String getGrade() {

		int marks = (syMarks.getTotal() / 4 + tyMarks.getTotal() / 6) / 2;

		if(marks >= 70)
			return "A";
		else if(marks >= 60)
			return "B";
		else if(marks >= 50)
			return "C";
		else if(marks >= 40)
			return "Pass";
		else
			return "Fail";
	}

	public static void printline(int n) {

		for(int i = 0; i < n; i++)
			System.out.print('-');
		System.out.println();
	}
		
	public static void main(String args[]) {

		Scanner ip = new Scanner(System.in);
		
		System.out.print("How many students : ");
		int n = ip.nextInt();

		Student student[] = new Student[n];
		int rno;
		String name;

		for(int i = 0; i < n; i++) {

			System.out.print("\nEnter roll No : ");
			rno = ip.nextInt();
			System.out.print("Enter name : ");
			name = ip.next();
			student[i] = new Student(rno, name);

			System.out.println("\nEnter SY Marks :");
			student[i].setSYMarks();
			System.out.println("\nEnter TY MArks :");
			student[i].setTYMarks();
		}
		
		Student.display(student);
	}
}		