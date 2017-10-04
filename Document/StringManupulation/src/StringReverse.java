import org.junit.Test;

public class StringReverse
{
	@Test
	public  void reverseIt() 
	{
		String source="hellow";
		   
		int i, len = source.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(source.charAt(i));
	    }

	    String rString=dest.toString();
	    System.out.println(rString);
	}

}
