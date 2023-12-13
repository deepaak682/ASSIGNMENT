package assignmentJava;

public class fibnocci {

	public static void main(String[] args) 
	
	{
		long n1=0;
	    long n2=1;
		
		long n3;
		System.out.print(n1 +" "+ n2 );
		for(int i=0;i<50;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
