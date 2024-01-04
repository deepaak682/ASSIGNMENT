package Assighnment9;

public class MultiDimensionalStringArray {

	public static void main(String[] args) 
	{
		String arr[][]= {
				{"deepa","girish","ram"},
				{"john","hari","sachu"},
				{"manu","tomi","kishan"},
		};
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
	            if(arr[i][j]=="john")
	            {
	            	found++;
	            }
	         
			}
	            
		}    
	   if (found>0) 
	   
		   System.out.println("value found");
	   else 
		   
		   System.out.println("not found");
	   
	   
	
	            
	  }		
}		

	


