package Assignment13;

public class transaction extends bank
{
	 int t_id ;
	  String t_name;
	  double t_amount;
	  
	  transaction()
	  {
		  t_id = 1045;
		  t_name = "online payment";
		  t_amount=30000;
	  }
	  public void showval() 
	  {
		  super.showval();
		System.out.println("transaction  number :" + t_id);
		System.out.println("transaction name :" + t_name);
		System.out.println("transaction amount :" + t_amount);
		  
	  }
}
