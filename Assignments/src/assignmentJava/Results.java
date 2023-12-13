package assignmentJava;

public class Results {
	public static void main(String[] args)
	{
	String sname1="deepa";
	String sname2="Girish";
	String sname3="Kishan";
	int s1m1=45;
	int s1m2=35;
	int s1m3=40;
	int s2m1=48;
	int s2m2=33;
	int s2m3=50;
	int s3m1=70;
	int s3m2=80;
	int s3m3=90;
	
	int totals1=s1m1+s1m2+s1m3;
	float avgs1=totals1/3;
	
	int totals2=s2m1+s2m2+s2m3;
	float avgs2=totals2/3;
	
	int totals3=s3m1+s3m2+s3m3;
	float avgs3=totals3/3;
	
	String result;
	if(s1m1<40 || s1m2<40||s1m3<40)
	{
		System.out.println(sname1 +" is failed with total marks "+ totals1 + " and average "+ avgs1);
	}
	else
	{
		System.out.println(sname1 +" is passed with total marks "+ totals1 + " and average "+ avgs1);
	}
	
	if(s2m1<40 || s2m2<40||s2m3<40)
	{
		System.out.println(sname2 +" is failed with total marks "+ totals2 + " and average "+ avgs2);
	}
	else
	{
		System.out.println(sname2 +" is passed with total marks "+ totals2 + " and average "+ avgs2);
	}
	
	if(s3m1<40 || s3m2<40||s3m3<40)
	{
		System.out.println(sname3 +" is failed with total marks "+ totals3 + " and average "+ avgs3);
	}
	else
	{
		System.out.println(sname3 +" is passed with total marks "+ totals3 + " and average "+ avgs3);
	}
	
	
	}
}
