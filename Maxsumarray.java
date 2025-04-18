import java.util.*;

public class Maxsumarray {

    public static int Printsumarray(int numbers[]){ //Print subarray functions

       int ms = Integer.MIN_VALUE;
       int cs = 0;
       
        for(int i = 0; i<numbers.length; i++){ //Calculate start
          int start = i;
             
             for(int j = i; j<numbers.length; j++){ //Calculate end
                int end = j;
                 
                for(int k = start; k<=end; k++){ //Print values from start to end
                    cs = cs+numbers[i];
                    if(cs>ms){
                        ms = cs;
                      return ms;
                    }
                }

                System.out.println();
                
             }

             System.out.println();
               
        }
                return cs;

}
    public static void main(String args[]){//Main function

        int numbers[] = {2,3,4,5,6,7,8};

        Printsumarray(numbers);
    }
    

}

