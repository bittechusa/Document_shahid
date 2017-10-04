import org.junit.Test;

public class FabonacciNumber 
{
	 @Test
     public  void fabonacci(){
         
        /* int febCount = 15;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int i=2; i < febCount; i++){
             feb[i] = feb[i-1] + feb[i-2];
         }
 
         for(int i=0; i< febCount; i++){
                 System.out.print(feb[i] + " ");
         }*/
		 
		 int x=0;
		 int y=1;
		 int n=10;
		 for(int i=2;i<=n;i++)
		 {
			 x=x+y;//1
			 y=x-y;//0
			 System.out.println(y);
		 }
		 
		 
    }
	 
	 @Test
	 public void swapNumber(){
	        int x = 10;
	        int y = 20;
	        x = x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	    }

}
