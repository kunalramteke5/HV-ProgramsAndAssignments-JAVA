
public class freq {
    public static void main(String[] args) {

        int[] arrSuperSet = { 3, 1, 3, 4, 1, 2, 1, 8, 3, 2, 1, 1, 3, 2, 3, 3, 4 };
        int[] arrSubSet = { 1, 2, 3, 5, 9 };
        int c = 0;
        for (int i = 0; i < arrSubSet.length; i++) {
            for (int j = 0; j < arrSuperSet.length; j++) {
                if (arrSubSet[i] == arrSuperSet[j]) {
                    c++;

                }

            }

            System.out.println("Frequency of " + arrSubSet[i] + ": " + c);
            c = 0;

        }
    }
}
