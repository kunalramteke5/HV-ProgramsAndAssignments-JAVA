import java.util.ArrayList;

public class arlist {
  public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<>();
    // To add values
    arr.add("A");
    arr.add("B");
    arr.remove(0);
    System.out.println(arr);
    // To Modify a value
    arr.set(0, "C");
    System.out.println(arr);

  }

} 
         
    