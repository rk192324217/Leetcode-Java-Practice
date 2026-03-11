
public class PrimeCount {
    public static void main(String[] args) {
        int trialChecks = 0;
        for (int n = 2; n <= 100; n++) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                trialChecks++;
                if (n % i == 0)
                    break;
            }
        }
        System.out.println("Trial Division checks: " + trialChecks);

        int sieveMarks = 0;
        boolean[] sieve = new boolean[101];
        for (int i = 2; i <= 100; i++)
            sieve[i] = true;

        for (int p = 2; p * p <= 100; p++) {
            if (sieve[p]) {
                for (int i = p * p; i <= 100; i += p) {
                    sieveMarks++;
                    sieve[i] = false;
                }
            }
        }
        System.out.println("Sieve of Eratosthenes marks: " + sieveMarks);
    }
}
