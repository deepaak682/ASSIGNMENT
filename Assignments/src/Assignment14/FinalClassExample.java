package Assignment14;

 class bikes
{
	final int speed=100;
	
	public void run()
	{
		System.out.println("bike is running with" + speed+ "speed");
	}
}
class heros extends bikes
{
	public void run()
	{
		//super.run();
		System.out.println("bike is running with 200 speed");
	}
}

public class FinalClassExample 
{

	public static void main(String[] args) 
	{
		heros h1=new heros();
		h1.run();
	   bikes b1=new bikes();
	   b1.run();
	  
	}

}
