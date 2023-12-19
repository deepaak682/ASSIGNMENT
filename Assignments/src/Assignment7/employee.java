package Assignment7;

class company
{
	private int bid;
	private String bname;
	private int amount;
	private int salary;
	
	company(int id,String name,int amt,int sal)
	{
		bid=id;
		bname=name;
		amount=amt;
		salary=sal;
		
		
	}

	public int getBid() {
		return bid;
	}

	
	public String getBname() {
		return bname;
	}

	

	public int getAmount() {
		return amount;
	}

	
	public int getSalary() {
		return salary;
	}


	
}

public class employee {

	public static void main(String[] args)
	{
		company obj1=new company(100,"deepa",1000,40000);
		company obj2=new company(103,"kishan",50000,20000);
		System.out.println( "bid is: " +obj1.getBid());
		System.out.println( "bname is : " +obj1.getBname());
		System.out.println( "amount is : "+ obj1.getAmount());
		System.out.println("salary is : "+ obj1.getSalary());
		System.out.println( "bid is: " +obj2.getBid());
		System.out.println( "bname is : " +obj2.getBname());
		System.out.println( "amount is : "+ obj2.getAmount());
		System.out.println("salary is : "+ obj2.getSalary());
	}

}
