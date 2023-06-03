import java.util.*;     //it contains the Arrays class and sort() in it
public class question2jun3{
  public static void main(String[] args) {
    int a[]={23,21,44,32,12}; 
    int temp = 0;   //declare and initialize the array
    Arrays.sort(a);        //used to sort the array in ascending/increasing order
    for(int i=0;i<a.length;i++){ 
      if (i == a.length-1) {
        System.out.println(a[i]);
      }
      else   //it will print the array after arranging in ascending/increasing array
        System.out.print(a[i]+" , ");
    }
    System.out.println();    //it will give a line break in output
      for(int i=a.length-1;i>=0;i--){ 
        if (i==0) {
          System.out.println(a[i]);
        }
        else  //it will print in decreasing/descending order
    
        System.out.print(a[i]+" , ");
    }         //we can store it in another array or in same array in reverse order and then print it}}

}
}