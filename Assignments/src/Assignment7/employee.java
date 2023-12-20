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

  void show(company o1, company o2)
	{
	
			System.out.println( "bid is: " + o1.bid);
		    System.out.println( "bname is : " + o1.bname);
		    System.out.println( "amount is : "+ o1.amount);
		    System.out.println("salary is : "+ o1.salary);
			System.out.println( "bid is: " +o2.bid); 
		    System.out.println( "bname is : " + o2.bname);
		    System.out.println( "amount is : "+ o2.amount);
			System.out.println("salary is : "+ o2.salary);
			}
}
public class employee {

	public static void main(String[] args)
	{
		company obj1=new company(100,"deepa",1000,40000);
		company obj2=new company(103,"kishan",50000,20000);
		obj1.getBid();
		obj1.getBname();
		obj1.getAmount();
		obj1.getSalary();
	    obj2.getBid();
	    obj2.getBname();
	    obj2.getAmount();
	    obj2.getSalary();
	    
		obj1.show(obj1,obj2);
	}
}


 