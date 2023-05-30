

public class prcaticeassim6 {
    public static void main(String[] args) {
        int num = 3;
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println("  ");
           
    }
}
}
    

