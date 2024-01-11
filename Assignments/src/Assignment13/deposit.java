package Assignment13;

public class deposit extends transaction
{
	 int d_id ;
	  
	  double d_amount;
	  
	  deposit()
	  {
		  d_id = 1023;
		  d_amount=50000;
	  }
	  public void showval() 
	  {
		  super.showval();
		System.out.println("deposit id :" + d_id);
		System.out.println("deposit amount :" + d_amount);
		  
	  }
}



