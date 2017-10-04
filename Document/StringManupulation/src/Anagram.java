import java.util.Arrays;

import org.junit.Test;

public class Anagram 
{
	//anagram test
	@Test
	public void isanagram()
	{
		System.out.println(isAnagram("hello","wlleh"));
	}
	
	public static boolean isAnagram(String s1, String s2){

        // Early termination check, if strings are of unequal lengths,
        // then they cannot be anagrams
        if ( s1.length() != s2.length() ) {
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1 = s1.toCharArray();
        System.out.println(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
}///end anagram
	
	//polingram test
	@Test
	public void test()
	{
		String s="hello";
		char[] c=s.toCharArray();
		System.out.println(istPalindrom(c));
	}


	public static boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	} 
	//end polingram
}
