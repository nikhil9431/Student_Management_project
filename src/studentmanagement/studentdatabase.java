package studentmanagement;

import java.util.Scanner;

public class studentdatabase {

	public static void main(String[] args) {
		
		
		
		System.out.println("enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofstudents = in.nextInt();
		student[] Students =new student[numofstudents];
		
		for(int n=0;n<numofstudents ;n++) {
			Students [n] =new student();
			Students [n].enroll();
			Students [n].Pay_Tuition();
			System.out.println(Students [n].ShowStudentInfo());
		}
		

	}

}
