public class Reverseasrray {

    //CREATION OF REVERSE ARRAY FUNCTION
        public static void ReverseanArray(int numbers[]){
            int j =0;
            int reversearray[] = new int[numbers.length];
            
            for(int i=numbers.length-1; i>=0; i--){
               
              reversearray[j] = numbers[i];
              j=j+1;
    
            }
    
            for(int i=0; i<reversearray.length; i++){
    
                System.out.print( reversearray[i]+" ");
            }
               
            System.out.println();
        }
    //CREATION OF MAIN FUNCTION
        public static void main(String args[]){
    
            int numbers[]={2,3,4,5,6,7};
            ReverseanArray(numbers);
    
        }
        
    }
    