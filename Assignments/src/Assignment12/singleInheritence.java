package Assignment12;

class human

{
    public void eat()
	{
		System.out.println("i am eating");
	}
	public void work()
	{
		System.out.println("i am working"); 
		
	}
	public void sleep()
	{
		System.out.println("i am sleeping");
	}
	
}

class deepa extends human
{
  
 public  void read() 
  {
	  System.out.println("reading");
  }
  public void speech() 
   {
	System.out.println("talking");
   }
  
  // constructor
		deepa()
 		{
			eat();
			work();
			sleep();
			read();
			speech();
 		}
	 
 }

public class singleInheritence 
{
	public static void main(String[] args)
	{
      deepa d = new deepa();
      
	}
	
}