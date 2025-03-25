public class Pairsinarray {
    //creation of pairsinarray function
    
    public static void PairsinArray(int numbers[]){
    
         for(int i=0; i<numbers.length; i++){
             for(int j=i+1; j<numbers.length; j++){
            System.out.print("("+numbers[i]+","+numbers[j]+")");
    
             }
             System.out.println();
         }
    
    
    }
    
    
    //main function
        public static void main(String args[]){
           int numbers[] = {2,4,6,8,10};
           PairsinArray(numbers);
        }
    }
    
