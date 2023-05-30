import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class coverarraytoarraylist {
    public static void main(String[] args) {
       String[] arr={"Hello","World","How","Are","You"};
       List<String> al=new ArrayList<>(Arrays.asList(arr));
       System.out.println(al);

       al.remove(1);
       System.out.println(al);

       //String[] arr1=al.toArray();
    }
    
}
