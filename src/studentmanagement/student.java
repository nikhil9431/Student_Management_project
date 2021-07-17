package studentmanagement;
import java.util.Scanner;

public class student {
	
	private String firstname;
	private String lastname;
	private int study_year;
	private String studentId;
	private String courses="";
	private int tuitionBalances=0;
	private static int costOfcources =600;
	private static int id =1001;
	
	public student() {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstname = in.nextLine();
		
		System.out.println("Enter student first name: ");
		this.lastname = in.nextLine();
		
		System.out.println("1 - first year student\n 2 - second year student\n 3 - third year student\n 4 - fourth year student\n Enter the year of student: ");
		this.study_year = in.nextInt();
		
		setstudentId();
		//System.out.println(firstname+" "+lastname+" "+ study_year+" "+studentId);
		
	}
	
	private void setstudentId() {
		id++;
		this.studentId = study_year+""+id;
	}
	
	public void enroll() {
		do {
		System.out.println("Enter course to enroll (q to quit): ");
		Scanner in =new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals ("q")) {
			courses= courses+ "\n " +course;
			tuitionBalances = tuitionBalances + costOfcources;
			}
		else {
		break;}
		} while (1 !=0);
		//System.out.println("Enrolled in: "+ courses);
		//System.out.println("your total Tutition Balance is: $"+tuitionBalances);
		
	}
	public void View_Balance() {
		//System.out.println("Your total balance left is: $"+tuitionBalances);
	}
	
	public void Pay_Tuition() {
		System.out.println("Enter the amount you want to pay now: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalances = tuitionBalances -payment;
		System.out.println("Thank you for your payment of $"+payment);
		View_Balance();
	}
	
	public String ShowStudentInfo() {
		return "Name of Student " +firstname+" "+lastname+"\nStudent study: "+study_year+"rd Year"+"\nStudent Id: "+studentId+"Courses enrolled: "+courses+"\nTotal balance left to pay: $"+tuitionBalances;
	}
}
