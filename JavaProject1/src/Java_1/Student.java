package Java_1;

import Java_1.Student;

public class Student {

	int age;
	int rollno;
	void display1()
	{
		System.out.println("Welcome to all of you!");
	}
	void display2()
	{
		System.out.println("Automation is very easy!");
	}
	
	public static void main(String[] args) {
		
		Student a1=new Student();
		a1.age = 15;
		System.out.println("Age is :" + a1.age);
		a1.age = 20;
		System.out.println("New Age is :" + a1.age);
		a1.rollno = 101;
		System.out.println("Roll no is : " +a1.rollno);
		a1.rollno = 201;
		System.out.println("New Roll no is : " +a1.rollno);
		a1.display1();
		a1.display2();
		
		

	}

}

