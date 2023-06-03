import java.util.Arrays;

public class count3 {
    public static void main(String[] args) {
       int [] a = {31,42,25,21,56,61,13,45,76,55};
       Arrays.sort(a);
       System.out.println("the element the minimun value: " + a[0]);
       
       System.out.println(" the element the maximun value: " +a[a.length-1]);
       int sum = 0;
       for ( int i = 0; i < a.length; i++){
        sum+=a[i];

       }
       float av = sum/a.length;
       System.out.println( " the avarege of all array element: " + av);
       System.out.println("the count of total number of array elements:" + a.length);
    }
    
}
