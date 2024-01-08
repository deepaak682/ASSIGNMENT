package Assignment12;

class human

{
    void eat()
	{
		System.out.println("i am eating");
	}
	void work()
	{
		System.out.println("i am working"); 
		
	}
	void sleep()
	{
		System.out.println("i am sleeping");
	}
	
}

class deepa extends human
{
  
  void read() 
  {
	  System.out.println("reading");
  }
  void speech() 
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