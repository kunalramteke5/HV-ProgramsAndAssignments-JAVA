public class primearray {
    public static void main(String[] args) {
        // print the Largest Prime number from the given array of integer numbers
        int[] arrNum = { 2, 29, 51, 8, 4 };
        int n = arrNum.length;
        int largest = arrNum[0];
        for (int i = 0; i < n; i++) {
            if (isPrime(arrNum[i])) {
                largest = arrNum[i];
            }
        }
        System.out.println("The Largest Prime number is: " + largest);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}