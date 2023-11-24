import java.util.Stack;

public void calculateSpan(int price[], int n, int S[]) {
    
    Stack<Integer> st = new Stack<>();
    st.push(0);

   
    S[0] = 1;

    
    for (int i = 1; i < n; i++) {
        
        while (!st.empty() && price[st.peek()] <= price[i]) {
            st.pop();
        }

        
        S[i] = (st.empty()) ? (i + 1) : (i - st.peek());

       
        st.push(i);
    }
}
