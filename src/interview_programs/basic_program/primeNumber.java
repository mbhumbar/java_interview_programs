package interview_programs.basic_program;

// write a program to print the prime number from 1 to 100.


public class primeNumber {

    public static void main(String[] args) {
        System.out.println("prime number from 1 to 100");
        int a = 16;
        double b = Math.sqrt(a);
        System.out.println(b);

        for (int i=2;i<=100;i++) {
            if (isPrime(i)) {
                System.out.println(" " + i);
            }
        }

    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) {
            if (num%i == 0) {
                return  false;
            }
        }
        return true;

    }

}
