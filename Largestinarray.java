import java.util.*;

public class Largestinarray {


 public static int LargestinArray(int rollno[])


 {

    int largest = Integer.MIN_VALUE;

    for(int i=1; i<rollno.length; i++){

        
   
     if(rollno[i] > largest)
    { 
        largest = rollno[i];
    }

   
 }
 return largest;

}
 
    public static void main(String[] args) {
        int rollno[] = {2, 4, 6, 8, 84, 12, 14, 16};
        
      
 System.out.println("Largest no in array :" + LargestinArray(rollno));

     
}


}




