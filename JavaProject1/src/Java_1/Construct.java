package Java_1;

public class Construct {
	Construct()
	{
		this(10,20,30);
		System.out.println("Default Constructor");
	}
	Construct(int a1)
	{
		this(100,200,300,400);
		System.out.println("One parameterized Constructor");
	}

	Construct(int a2,int b2)
	{
		this();
		System.out.println("Two parameterized Constructor");
	}
	Construct(int a3,int b3,int c3)
	{
		System.out.println("Three parameterized Constructor");
	}
	Construct(int a4,int b4,int c4,int d4)
	{
		this(15,30);
		System.out.println("Four parameterized Constructor");
		System.out.println("Four parameterized Constructor done");
	}
	public static void main(String[] args) {
		
		Construct cst = new Construct(10);

	}

}
