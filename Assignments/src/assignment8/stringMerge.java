package assignment8;

public class stringMerge {

	public static void main(String[] args) {
		String[] names = { "deepa","kishan","girish"};
	
		int[] id= {10,11,12};
        
		String first = names[0].concat(String.valueOf(id[0])); //  10 ->"10"
		
		String second = names[1].concat(String.valueOf(id[1])); 
		
		String third = names[2].concat(String.valueOf(id[2])); 
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
	}

}
