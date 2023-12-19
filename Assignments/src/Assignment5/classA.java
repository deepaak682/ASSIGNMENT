package Assignment5;

public class classA 
{
	void multiply(int x,int y )
	{
		int z= x * y;
		System.out.println("integer multiplication = "+z);
	}
	void multiply(float x,int y, int z )
	{
		 z= (int)(x * y);
		System.out.println("integer multiplication = "+z);
	}
	
	void multiply(int x,int y, float z )
	{
		  z = (int)(x * y);
		System.out.println("integer multiplication = "+z);
	}
	
	public static void main(String[] args) 
	{
		classA c=new classA();
		c.multiply(3,2,1.5f);
		c.multiply(10,2);
		c.multiply(2.5f,5,4);
		
		
	}

}
