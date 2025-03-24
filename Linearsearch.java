
import java.util.*;
public class Linearsearch {
 public static int LinearSearch(String menu[],String food)
 {
    for(int i=0; i<menu.length; i++){
   
        if(menu[i] == food )
    { 
        return i;
    }
 }
 return -1;
    
}
 
    public static void main(String[] args) {
       
        String menu[] = {"dosa", "sambhar", "idli", "chutney"};
        String food = "sambhar";
      
      
        int index =  LinearSearch(menu,food);

      if(index == -1){
        System.out.println("Key not found");
      }
      else{
        System.out.println("Key is found at index"+" "+index);
      }
      
    }
    

}



