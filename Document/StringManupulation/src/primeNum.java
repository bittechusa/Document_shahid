import org.junit.Test;

public class primeNum
{
	@Test
	public void stringReverse()
	{
		
		System.out.println(isPrimeNumber(17));
		
	}
	//prime number
	 public boolean isPrimeNumber(int number){
         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }

}
