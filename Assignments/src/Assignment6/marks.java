package Assignment6;

public class marks {
	
	static int m1;
	static int m2;
	static int m3;
    static int total;
    static float avg;
   
	static 
	{
		m1=60;
		m2=70;
		m3=80;
	   total=m1+m2+m3;
	   avg=total/3;
		
	}
    void show()
{
	System.out.println("total mark is " + total);
	System.out.println("average mark is " + avg);
	
}
	
	public static void main(String[] args) 
	{
      marks m=new marks();
      m.show();
      
	}
	


}	
	

