package Assignment4;

import java.util.Scanner;

public class student {
	int sid;
	String sname;
	int rno;
	int total;
	float avg;
	void Read() 
	{
		Scanner Sc=	new Scanner(System.in);
		
		System.out.println("enter the student id: ");
		sid= Sc.nextInt();
		Sc.nextLine();
		System.out.println("enter the student name: ");
		sname= Sc.nextLine();
	
		System.out.println("enter the rollnumber: ");
		rno= Sc.nextInt();
		System.out.println("enter the total marks: ");
		total= Sc.nextInt();
		System.out.println("enter the average marks: ");
		avg= Sc.nextFloat();
		Sc.close();
	}
	void showval()
	{
	System.out.println("student id is "+ sid);
	System.out.println("student name is "+ sname);
	System.out.println("rollnumbr is " + rno);
	System.out.println("total mark is "+ total);
	System.out.println("average mark is "+ avg);
	
	}
	public static void main(String[] args) 
	{
		student sd=new student();
		sd.Read();
		sd.showval();
		
	}

}
