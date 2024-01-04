package Assignment10;

class sample
{
	int age;
	String name;

	public sample copyobj(sample ob)
	{
		age=ob.age;
		name=ob.name;
		return ob;
	}
	public void show() 
	{
		System.out.println("age : "+age);
		System.out.println("sname :"+ name); 
		
	}	
		
}
public class ObjectArray {

	public static void main(String[] args)
	{
		sample[] obj=new sample[4];
		
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new sample();
		}		
		
		obj[0].age=25;
		obj[0].name="kumar";
		
		
   obj[2]=obj[0].copyobj(obj[0]);
   obj[3]=obj[2];
   obj[1] =obj[3];

     for(int i=0;i<obj.length;i++)
     {
    	 obj[i].show();
     }
   }

}
