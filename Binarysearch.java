import java.util.*;

public class Binarysearch {
    public static int BinarySearch(int[] numbers, int key){

        int start= 0, end= numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
        

        if(numbers[mid] == key){

            return mid;
        }

        if(numbers[mid]<key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }

    return -1;
}


//MAIN FUNCTION
    public static void main(String args[]){

        int numbers[] = {2,4,6,8,10,12,14,16,18};

        int key = 14;

        //BINARYSEARCH FUNCTION CALL

 int index = BinarySearch(numbers, key);

       if(index == -1){
        System.out.println("key not found");
       }
       else{
        System.out.println("key found at index :"+index);
       }


    }
}

