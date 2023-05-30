import java.util.Scanner;

public class practiceassign5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String choi = "y";
        while (choi.equals("y")){
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("CM to M");
            System.out.println("M to KM");
            System.out.println("KM to M");
            System.out.println("M to CM");
            System.out.print("Enter your menu - ");
            int met = s.nextInt();
            switch (met) {
                case 1:

                System.out.print("Please enter the CM Value: ");
                Float cmval = s.nextFloat();
                System.out.println(cmval+" CM" + " =" + (cmval/100) + " M");
                    
                    break;
                case 2:
                
                System.out.print("Please enter the M Value: ");
                Float Mval = s.nextFloat();
                System.out.println(Mval+" M" + " =" + (Mval/1000) + " KM");

                break;

                case 3 :

                System.out.println("Please enter the KM value: ");
                Float KMval = s.nextFloat();
                System.out.println(KMval + " KM" + " =" + ( KMval*1000) + " M");

                break;

                case 4 :

                System.out.println("Please enter the M :");
                Float CMval = s.nextFloat();
                System.out.println(CMval + " M" + " =" +(CMval*100) + " CM");

                break;


            
                default:
                    break;
            }

            System.out.print("Do you want to Continue: ");
            choi = s.next();

        }

    }
    
}
