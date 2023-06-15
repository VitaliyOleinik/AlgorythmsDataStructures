package easy;

import java.util.Scanner;

public class IsPrime3 {
    static boolean[] isPrime = new boolean[100];

    static void isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= n / 2; i++){
            if(isPrime[i] == true){
                int j = i + i;
                while(j <= n){
                    isPrime[j] = false;
                    j += i;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        isPrime(n);
    }
}
