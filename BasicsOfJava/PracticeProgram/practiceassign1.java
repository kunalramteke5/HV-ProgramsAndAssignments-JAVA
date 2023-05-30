import java.util.Scanner;

public class practiceassign1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks obtained: ");
        Float mob = sc.nextFloat();
        System.out.print("Enter the marks in total: ");
        Float pob = sc.nextFloat();
        Float num = mob/pob*100;
        System.out.println("percentage obtained: " + num + "%");
        
        if (num<=59){
            System.out.println("Grade F, GPA = 0.0 ");
        }
else if (num<= 69 && num>59){
    System.out.println("Grade D , GPA = 1.0 ");
}
else if ( num<=79 && num >69){
    System.out.println("Grade C , GPA = 2.0");
}

else if (num <= 89 && num >79){
    System.out.println("Grade B , GPA = 3.0 ");
}
else if (num <= 100 && num >89 ){
    System.out.println("Grade A , GPA = 4.0");
}
sc.close();
    }
    
}
