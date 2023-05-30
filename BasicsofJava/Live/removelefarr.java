public class removelefarr {
    public static void main(String[] args) {
        //removing an element from array

    int[] s3 = {1,3,5,7,9,11,13,15,17};
    int removed_value = 9;
    int index = -1; 
    for( int j=0;j<s3.length;j++)
    {
        if(s3[j]==removed_value)
        {
            index=j;
            break;
        }
    }
    if(index!=-1)
    {
        int [] s4= new int[s3.length-1];
        System.arraycopy(s3, 0, s4, 0, index);
        System.arraycopy(s3, index+1, s4, index, s3.length-index-1);
        s3=s4;
    }
    for(int l : s3)
    {
        System.out.println(l);
    }
    }
    
}
