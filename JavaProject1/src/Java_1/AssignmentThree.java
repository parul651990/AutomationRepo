package Java_1;

public class AssignmentThree {
	
	public int add(int a, int b)
	{
		int c =a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c= a-b;
		return c;
	}
	public int mul(int a, int b)
	{
		int c = a*b;
		return c;
	}
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println("Final result is :" +c);
	}
	public static void main(String[] args) {
		AssignmentThree as = new AssignmentThree();
		//((((((10*2)+2)-2)-2)+2)/2)
		int r1 = as.mul(10, 2);
		System.out.println("First operation result r1 is :" +r1);
		int r2 = as.add(r1, 2);
		System.out.println("First operation result r2 is :" +r2);
		int r3 = as.sub(r2, 2);
		System.out.println("First operation result r3 is :" +r3);
		int r4 = as.sub(r3, 2);
		System.out.println("First operation result r4 is :" +r4);
		int r5 = as.add(r4, 2);
		System.out.println("First operation result r5 is :" +r5);
		as.div(r5, 2);
		

	}

}
