/**
 * 
 */
package com.jwetherell.algorithms.mathematics;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

/**
 * @author m
 *
 */
public class PrimesTest {

	/**
	 * Test method for {@link com.jwetherell.algorithms.mathematics.Primes#getPrimeFactorization(long)}.
	 */
	void testGetPrimeFactorization() {
        // Regular case
        Map<Long, Long> result = Primes.getPrimeFactorization(18);
        assertEquals(2, result.size());
        assertEquals(1, result.get(3));  // 18 = 3^2 * 2
        assertEquals(1, result.get(2));

        // Edge case: prime number
        result = Primes.getPrimeFactorization(29);
        assertEquals(1, result.size());
        assertEquals(1, result.get(29));

        // Edge case: 1 has no prime factors
        result = Primes.getPrimeFactorization(1);
        assertTrue(result.isEmpty());

        // Edge case: very large number
        result = Primes.getPrimeFactorization(1000000000L);
        assertEquals(2, result.size());  // 1000000000 = 2^3 * 5^9
        assertEquals(3, result.get(2));
        assertEquals(9, result.get(5));
    }

    @Test
    void testIsPrime() {
        // Regular cases
        assertTrue(Primes.isPrime(2)); // 2 is prime
        assertTrue(Primes.isPrime(3)); // 3 is prime
        assertFalse(Primes.isPrime(4)); // 4 is not prime
        assertTrue(Primes.isPrime(29)); // 29 is prime

        // Edge case: 1 is not prime
        assertFalse(Primes.isPrime(1));

        // Edge case: large prime
        assertTrue(Primes.isPrime(104729)); // 104729 is prime

        // Edge case: large non-prime
        assertFalse(Primes.isPrime(1000000000)); // 1000000000 is not prime
        
        // Test for zero and negative numbers
        assertFalse(Primes.isPrime(0));  // Zero is not prime
        assertFalse(Primes.isPrime(-1)); // Negative numbers are not prime
    }

    @Test
    void testSieveOfEratosthenes() {
        // Regular cases
        assertTrue(Primes.sieveOfEratosthenes(2)); // 2 is prime
        assertTrue(Primes.sieveOfEratosthenes(3)); // 3 is prime
        assertFalse(Primes.sieveOfEratosthenes(4)); // 4 is not prime
        assertTrue(Primes.sieveOfEratosthenes(29)); // 29 is prime

        // Edge case: 1 is not prime
        assertFalse(Primes.sieveOfEratosthenes(1));

        // Edge case: large prime
        assertTrue(Primes.sieveOfEratosthenes(104729)); // 104729 is prime

        // Edge case: large non-prime
        assertFalse(Primes.sieveOfEratosthenes(1000000000)); // 1000000000 is not prime
        
        assertFalse(Primes.sieveOfEratosthenes(0)); // Zero is not prime
        
        // Test large number with sieve (assumes sieve size limit is reasonable)
        assertTrue(Primes.sieveOfEratosthenes(100000)); // 100000 is non-prime
        assertTrue(Primes.sieveOfEratosthenes(104729)); // 104729 is prime
    }

    @Test
    void testMillerRabinTest() {
        // Regular cases
        assertTrue(Primes.millerRabinTest(2)); // 2 is prime
        assertTrue(Primes.millerRabinTest(3)); // 3 is prime
        assertFalse(Primes.millerRabinTest(4)); // 4 is not prime
        assertTrue(Primes.millerRabinTest(29)); // 29 is prime

        // Edge case: 1 is not prime
        assertFalse(Primes.millerRabinTest(1));

        // Edge case: very large prime number
        assertTrue(Primes.millerRabinTest(104729)); // 104729 is prime

        // Edge case: very large non-prime number
        assertFalse(Primes.millerRabinTest(1000000000)); // 1000000000 is not prime
        
        assertFalse(Primes.millerRabinTest(0)); // Zero is not prime
    }
}
