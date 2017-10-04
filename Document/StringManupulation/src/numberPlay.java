import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import org.junit.Test;

public class numberPlay 
{
	
	
	
	
	
	//reverse a number
	@Test
	 public void reverseNumber()
	{
		int number=874;
         
	        int reverse = 0;
	        while(number != 0){
	        
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	        }
	        System.out.println(reverse);
	    }
	     
	@Test
	public void getTwonNum()
	{
		int a[]={34,43,12,45,98};
		
		        int maxOne = 0;
		        int maxTwo = 0;
		        for(int n:a){
		            if(maxOne < n){
		                maxTwo = maxOne;//45
		                maxOne =n;//95
		            } else if(maxTwo < n){
		                maxTwo = n;
		            }
		        }
		        System.out.println("First Max Number: "+maxOne);
		        System.out.println("Second Max Number: "+maxTwo);
		    }
		
	//to find duplicate character
	
	@Test
	public void findDuplicateChars(){
         
		 //to find duplicate character 
		 List<String> list=new ArrayList<String>();

		 String str="Java2Novice";

		 String[] array=str.split("");

		 System.out.println(array.length);

		 list=Arrays.asList(array);

		 HashSet<String> hash= new HashSet<String>();

		 hash.addAll(list);

		 for(String s:hash){

			 
		 if(Collections.frequency(list, s)>=2){

		 System.out.println(s+" -----is "+ Collections.frequency(list, s));
	 }
	 
	 }
	 }
	 
	 
	 //another way to find to unique character
	 @Test
	 public void duplicateCharacter()
	 {
		 //to find unique character
//		 String a = "abcdaebb";
//
//		 String sa[] = a.split("");
//
//		 Set mySet = new HashSet();
//
//		 Collections.addAll(mySet, sa);
//
//		 System.out.println(mySet);
		 
	 }	
	 
	 //swap between two number without third variable
	 
	 
	 //fabbonacci number
	

	 //DISTINCT VAlue
	 @Test
	 public void distinctValue() {

		 Set<Integer> distinctElements=new HashSet<Integer>();

		 Set<Integer> duplicateElements=new HashSet<Integer>();

		 int [] array={1,1,1,2,2,3,4,4,5,6} ;

		 for (int currentElement : array) {

		 if(duplicateElements.contains(currentElement)){

		 }
	 
		 }
}
	 
	 //distinct word from file
	 public static List<String> getDistinctWordList(String fileName){
		 
	        FileInputStream fis = null;
	        DataInputStream dis = null;
	        BufferedReader br = null;
	        List<String> wordList = new ArrayList<String>();
	        try {
	            fis = new FileInputStream(fileName);
	            dis = new DataInputStream(fis);
	            br = new BufferedReader(new InputStreamReader(dis));
	            String line = null;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
	                while(st.hasMoreTokens()){
	                    String tmp = st.nextToken().toLowerCase();
	                    if(!wordList.contains(tmp)){
	                        wordList.add(tmp);
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{if(br != null) br.close();}catch(Exception ex){}
	        }
	        return wordList;
	    }
	     
	    public static void main1(String a[]){
	         
	       
	        List<String> wordList = getDistinctWordList("C:/sample.txt");
	        for(String str:wordList){
	            System.out.println(str);
	        }
	    }
	
	   
	  
	    
	   
	    
	    
	    }

	   
