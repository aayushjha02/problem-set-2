/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
import java.util.Scanner;
public class ProblemSet2 {
	Scanner in = new Scanner(System.in);
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Please enter first name");
		String text = in.nextLine();
		System.out.println("Please enter last name");
		String text2 = in.nextLine();
		System.out.println("Hello " + text + " " + text2);
		
	}
	
	public void gradeMe() {
		
		System.out.println("Enter 3 homework scores, 3 quiz scores, 3 test scores");
		double homework1 = in.nextDouble();
		
		double homework2 = in.nextDouble();
		
		double homework3 = in.nextDouble();
		
		double quiz1 = in.nextDouble();
		
		double quiz2 = in.nextDouble();
		
		double quiz3 = in.nextDouble();
		
		double test1 = in.nextDouble();
		
		double test2 = in.nextDouble();
		
		double test3 = in.nextDouble();
		
		
		double homeworkaverage = (homework1 + homework2 + homework3) / 3;
		double quizaverage = (quiz1 + quiz2 + quiz3) / 3;
		double testaverage = (test1 + test2 + test3) / 3;
		double homeworkweight = homeworkaverage * 0.15;
		double quizweight = quizaverage * 0.3;
		double testweight = testaverage * 0.55;
		double overallgrade = homeworkweight + quizweight + testweight;
		System.out.println("Your overall grade is " + overallgrade);
	
		
		
	}
	
	public void groupUs() {
		int finalBus;
		System.out.println("What is the number of students?");
		int students = in.nextInt();
		System.out.println("What is the number of teachers?");
		int teachers = in.nextInt();
		int total = students + teachers;
		int busCount;
		if(total%47 != 0) {
			int busPrimaryCount = total / 47;
			busCount = busPrimaryCount + 1;
			finalBus = total % 47;
		}
		else {
			busCount = total / 47;
			finalBus = 47;
		}
		System.out.println("The total number of buses is " + busCount + " Buses"); 
		if (busCount == 1) {
			System.out.println("The number of people on the final bus is " + finalBus);
		}
		else {
			System.out.println("The number of people every bus except for the last one is 47, the number of people on the last bus is " + finalBus);
		}
		
	}
	
	public void info() {
			in.nextLine();
			System.out.println("Please enter your first and last name");
			String name = in.nextLine();
			System.out.println("Please enter your grade level as a word");
			String grade = in.nextLine();
			System.out.println("Please enter your age as a word");
			String age = in.nextLine();
			System.out.println("Please enter your hometown");
			String hometown = in.nextLine();
					System.out.println("NAME     : " + name);
					System.out.println("GRADE    : " + grade);
					System.out.println("AGE      : " + age);
					System.out.println("HOMETOWN : " + hometown);

	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		String firstName = in.nextLine();
		System.out.print("Please enter your middle name: ");
		String middleName = in.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = in.nextLine();
		char firstInitial = Character.toUpperCase(firstName.charAt(0));
		char middleInitial = Character.toUpperCase(middleName.charAt(0));
		char lastInitial = Character.toUpperCase(lastName.charAt(0));
		System.out.println("Your initials are " + firstInitial + middleInitial + lastInitial);
		in.close();
	}
	
}