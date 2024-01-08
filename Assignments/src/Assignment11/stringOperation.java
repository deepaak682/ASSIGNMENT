package Assignment11;

public class stringOperation 
{
      String name="DEEPA" ;
      char nameArr[] = new char[5];
      int count=0;
      
      
    void computeLength()
    {
    	
    	for(int i=0;i<name.length();i++)
    	{
    		nameArr[i] = name.charAt(i);
    		if(nameArr[i]!= 0)
    		{
    			count++;
    		}  		
    		
    	}
    	System.out.println("length of string is :" + count);
    }
    //printing characters
    
    void PrintSingleChar()
    {
    	System.out.println("The  characters in the name are: ");
    	
    	for(int i=0;i<name.length();i++)
    	{
    		nameArr[i] = name.charAt(i);
    		System.out.println( nameArr[i] ); 
    	}	
    }
    
    void reversename()
    {
    	System.out.print("name in reverse is: ");
    	for(int i=0;i<name.length();i++)
    	{
    		nameArr[i] = name.charAt(i);
    	}
    	for(int j=nameArr.length-1;j>=0;j--)
    	{
    		System.out.print(nameArr[j]);
    		
    	}
    	System.out.println();
    }
    //print first 3 chars 
    void chars()
    {
    	System.out.println("first three character is :");
    	for(int i=0;i<3;i++)
    	{
    		nameArr[i] = name.charAt(i);
    		System.out.println(nameArr[i]);
    	}	
    }
	
	public static void main(String[] args) 
	{
		
		stringOperation obj=new stringOperation();
		obj.computeLength();
		obj.PrintSingleChar();
	    obj.reversename();
	    obj.chars();

	}

}
