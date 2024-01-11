package Assignment13;

public class bank
{
	  int acc_id ;
	  String acc_name;
	  double amount;
	  
	  bank()
	  {
		  acc_id = 1034;
		  acc_name = "deepa";
		  amount=10000;
	  }
	  public void showval() 
	  {
		  
		System.out.println("account number :" + acc_id);
		System.out.println("account name :" + acc_name);
		System.out.println("amount :" + amount);
		  
	  }
}
