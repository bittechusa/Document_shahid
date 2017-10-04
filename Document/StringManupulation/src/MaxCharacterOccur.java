import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class MaxCharacterOccur 
{
	
	public void maxOccur(String ip)
	{

	    LinkedHashMap<Character, Integer> hash = new LinkedHashMap();
	    for(int i = 0; i<ip.length();i++)
	    {
	        char ch = ip.charAt(i);
	        if(hash.containsKey(ch))
	        {
	           hash.put( ch,(hash.get(ch)+1));

	        }
	        else
	        {
	            hash.put(ch, 1);
	        }
	    }

	   //Set set = hash.entrySet();
	   Entry<Character, Integer> maxEntry = null;
	   System.out.println(hash.entrySet());
	   for(Entry<Character,Integer> entry : hash.entrySet())
	   {
	      if(maxEntry == null)
	      {
	          maxEntry = entry;
	      }
	    

	      else if(maxEntry.getValue() < entry.getValue())
	      {
	    	  System.out.println(entry.getValue());
	    	  System.out.println(maxEntry.getValue());
	          maxEntry = entry;
	      }
	   }
	    System.out.println(maxEntry.getKey());


	}
	@Test
	public void ma() {
	    
		maxOccur("abccddd");
	}

}
