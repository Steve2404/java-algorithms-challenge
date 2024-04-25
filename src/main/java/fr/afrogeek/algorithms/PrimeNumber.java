package fr.afrogeek.algorithms;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        int limite = (int) Math.sqrt(n) + 1;
        for (int i = 5; i < limite; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }


}
