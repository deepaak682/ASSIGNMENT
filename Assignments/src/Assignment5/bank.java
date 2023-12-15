package Assignment5;

public class bank {
	long acc_no;
	String acc_name;
	long amount;
	long dep;
	long trans;
	
	void setval()
	{
	  acc_no= 486787683;
	  acc_name="DEEPA";
	  amount= 200000;
	  dep= 500000;
	  trans=50000;
	  
	}

	void getval()
	{
		
		System.out.println("account number is "+ acc_no);
		System.out.println("acc_name is " + acc_name);
		System.out.println("amount is " + amount);
		System.out.println("deposited amount is " + dep);
		System.out.println("transaction amount is " + trans);
		
		
		
	}
	public static void main(String[] args) 
	{
		bank b=new bank();
		
		b.setval();
		b.getval();

		
		
	}

}
