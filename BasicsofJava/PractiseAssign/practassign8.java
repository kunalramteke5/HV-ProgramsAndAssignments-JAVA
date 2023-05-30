import java.util.Scanner;

public class practassign8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("first number: ");
        int num1 = s.nextInt();
        System.out.print("second number: ");
        int num2 = s.nextInt();
        System.out.print("third number: ");
        int num3 = s.nextInt();
        

        int smallest = num1;
        if (num2<smallest){
            smallest = num2;
        }
        if (num3<smallest){
            smallest = num3;

        }
        int largest = num1;
        if (num2>largest){
            largest = num2;

        }
        if (num3>largest){
            largest = num3;
        }
        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("the smallest number: " + smallest);
        System.out.println("the largest number: " + largest);
        System.out.println("average: " + average);

        s.close();

        

    }
    
}
