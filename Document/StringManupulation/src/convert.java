import org.junit.Test;

public class convert 
{
	 ///convert s string to integer
    
    public static int convert_String_To_Number(String numStr){
         
        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }
     @Test
    public void convertStringToNumber(){
         
    	 int a=convert_String_To_Number("87");
    	 int b=convert_String_To_Number("99");
        System.out.println(a+b);
    }
    

}
