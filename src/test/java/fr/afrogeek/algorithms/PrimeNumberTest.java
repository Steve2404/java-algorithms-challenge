package fr.afrogeek.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    @Test
    void testPrimeNumberNegativ(){
        assertTrue(PrimeNumber.isPrime(-1), "-1 n est pas premier");
    }

    @Test
    void testPrimeZahl(){
        assertTrue(PrimeNumber.isPrime(2), "2 est premier");
        assertTrue(PrimeNumber.isPrime(3), "3 est premier");
        assertTrue(PrimeNumber.isPrime(5), "5 est premier");
        assertTrue(PrimeNumber.isPrime(7), "7 est premier");
        assertTrue(PrimeNumber.isPrime(11), "11 est premier");
    }

    @Test
    void testNonPrimeZahl(){
        assertTrue(PrimeNumber.isPrime(0), "0 n est pas premier");
        assertTrue(PrimeNumber.isPrime(1), "1 n est pas premier");
        assertTrue(PrimeNumber.isPrime(4), "4 n est pas premier");
        assertTrue(PrimeNumber.isPrime(6), "6 n est pas premier");
        assertTrue(PrimeNumber.isPrime(8), "8 n est pas premier");
        assertTrue(PrimeNumber.isPrime(9), "9 n est pas premier");
        assertTrue(PrimeNumber.isPrime(10), "10 n est pas premier");
    }
}
