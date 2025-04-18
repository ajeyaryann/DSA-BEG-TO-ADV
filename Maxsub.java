public class Maxsub {

public static int maxsummSubArray(int[] numbers){

  int ms=Integer.MIN_VALUE;

for(int i = 0; i<numbers.length; i++){
     int cs = 0;

    for(int j =i; j<numbers.length; j++){
        
         cs = cs + numbers[j];
    }

    if(cs>ms){
        ms = cs;

    }

}


return ms;

}



    public static void main(String args[]){

        int[] numbers ={2,3,-4,5,6,7};

        int maxsum = maxsummSubArray(numbers);

        System.out.println("Max sum is"+ maxsum);
    }
    
}
