package easy;

import java.util.Scanner;

public class IsPrimeAnotherSolution {
    private static boolean checkIsPrime(int x) {
        boolean result = true;

        if (x == 1) {
            result = false;
        }

        for (int i = 2; i <= Math.sqrt(x); ++i) {
//            System.out.print(i + " ");
            if (x % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        System.out.println("this element isPrime - " + checkIsPrime(x));
    }
}
