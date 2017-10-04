import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.junit.Test;

public class DistinctWord 
{

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
	     @Test
	    public void dWord(){
	         
	       
	        List<String> wordList = getDistinctWordList("/Users/shahidulislam/Documents/workspace/StringManupulation/sample.txt");
	        for(String str:wordList){
	            System.out.println(str);
	        }
	     }
}
