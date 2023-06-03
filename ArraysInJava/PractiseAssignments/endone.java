
import java.util.ArrayDeque;
import java.util.Deque;

public class endone {
    public static void main(String[] args) {
    int[] arr = {3, 1, 4, 1, 2, 1, 8, 3, 2, 1};
    int count=0;
    Deque<Integer> de_que = new ArrayDeque<Integer>();
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=1){
            de_que.add(arr[i]);
            count++;
            
        }
        
    }
    for(int i=0;i<(arr.length)-(count);i++){
        de_que.add(1);
    }
    
    System.out.println("Array elements after moving Ones to end: "+de_que);
    }
    
}
