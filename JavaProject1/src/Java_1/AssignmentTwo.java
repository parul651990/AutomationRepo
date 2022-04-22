package Java_1;

public class AssignmentTwo {
	public int add(int a, int b)
	{
		int c= a+b;
		return c;
	}

    public int sub(int d, int e)
    {
    	int f = d-e;
    	return f;
    }
    
    public int mul(int g, int h) 
    {
    	int i = g*h;
    
    	return i;
    	
    }
     public void div(int j,int k)
     {
    	 int l = j/k;
    	 System.out.println("Final result is :"+l);
     }
    
	public static void main(String[] args) {
    AssignmentTwo as = new AssignmentTwo();
  //((((((10+2)-2)+2)*2)/2)
    int r1 = as.add(10,2);
    System.out.println("First operation result r1 is :" +r1);
    int r2 = as.sub(r1, 2);
    System.out.println("Second operation result r2 is :" +r2);
    int r3 = as.add(r2, 2);
    System.out.println("Third operation result r3 is :" +r3);
    int r4 = as.mul(r3,2);
    System.out.println("Fourth operation result r4 is :" +r4);
    as.div(r4, 2);
    
    
    
    //int subresult = as.sub(20,10);
    //System.out.println("Subtraction result is : " + subresult);
    
    
    
    
    
    

	}

}
