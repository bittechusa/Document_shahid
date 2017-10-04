import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class CopyArray 
{
	@Test
	 public void ma()
	{
		
	       /* int a[] = { 1, 2, 3, 4, 5, 6 };
	        int b[] = new int[a.length];
	        for (int i = 0; i < a.length; i++) {
//	             b[i]=a[i];
//	        }
	        for(int j=0;j<b.length;j++)
	        {
	        	System.out.println(b[j]);
	        }*/ //one way
	        
	        
	      /* int b[]=a.clone();
	        for(int j=0;j<b.length;j++)
	        {
	        	System.out.println(b[j]);
	        }*/ //one way

//	        
	    }
	

	@Test
    public void dupNumArray()
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz"};
 
        //1. Using Brute Force Method
 
//        for (int i = 0; i < strArray.length-1; i++)
//        {
//            for (int j = i+1; j < strArray.length; j++)
//            {
//                if( (strArray[i].equals(strArray[j])) && (i != j) )
//                {
//                	
//                    System.out.println("Duplicate Element is : "+strArray[i]);
//                }
//            }
//        }
 
        //2. Using HashSet
 /*
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }*/
        
        
        
        HashSet<String> set = new HashSet<String>();
 
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
            	set.remove(arrayElement);
                System.out.println("Duplicate Element is : "+arrayElement);
            }
            
        }
        System.out.println(set);
       
       
       
    }
	
	@Test
	public void removeDupInIntArray()
	{
		int[] ints={3,6,7,6,9};
	    Set<Integer> setString = new LinkedHashSet<Integer>();
	    for(int i=0;i<ints.length;i++){
	        setString.add(ints[i]);
	    }
	    System.out.println(setString);
	}

}
