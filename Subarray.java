
import java.util.*;

public class Subarray {

    public static void Printsubarray(int numbers[]){ //Print subarray functions

       
       
        for(int i = 0; i<numbers.length; i++){ //Calculate start
          int start = i;
             
             for(int j = i; j<numbers.length; j++){ //Calculate end
                int end = j;
                 
                for(int k = start; k<=end; k++){ //Print values from start to end
                    
                    System.out.print(numbers[k]+",");
                }

                System.out.println();
                
             }

             System.out.println();
               
        }

}
    public static void main(String args[]){//Main function

        int numbers[] = {2,3,4,5,6,7,8};

        Printsubarray(numbers);
    }
    

}
