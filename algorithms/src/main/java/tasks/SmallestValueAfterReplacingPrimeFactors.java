package tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SmallestValueAfterReplacingPrimeFactors {
    private static final Set<Integer> FIRST_PRIMES = Set.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31);
    /**
     * You are given a positive integer n.
     * Continuously replace n with the sum of its prime factors.
     * Note that if a prime factor divides n multiple times,
     * it should be included in the sum as many times as it divides n.
     * Return the smallest value n will take on.
     * @param n -
     * @return -
     */
    public int smallestValue(int n) {
        return easyRealization(n);
    }

    private int easyRealization(int n) {
        Set<Integer> basicPrimes = new HashSet<>(FIRST_PRIMES);
        Set<Integer> visited = new HashSet<>();

        while (!basicPrimes.contains(n) && !visited.contains(n)) {
            visited.add(n);
            Map<Integer, Integer> primes = new HashMap<>();

            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    primes.merge(i, 1, Integer::sum);

                    n /= i;
                }
            }

            if (n  != 1) {
                primes.merge(n, 1, Integer::sum);
            }

            n = primes.entrySet().stream().mapToInt(it -> it.getValue() * it.getKey()).sum();
        }

        return n;
    }
}
