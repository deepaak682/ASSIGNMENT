package Assighnment9;

public class MultiDimensionalStringArray {

	public static void main(String[] args) 
	{
		String arr[][]= {
				{"deepa","girish","ram"},
				{"jhon","hari","sachu"},
				{"manu","tomi","kishan"},
		};
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
	            if(arr[i][j]=="jhon")
	            {
	            	System.out.println(  arr[i][j]+ "found");
	            }
	           
			}
	            
		}    
	          
	            
	}		
}		

	


