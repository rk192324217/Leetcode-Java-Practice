public class IterationCount {
    public static void main(String[] args) {
        int[] testNs = {100, 1000, 10000};
        for (int N : testNs) {
            // Trial Division Count (Up to sqrt(n))
            int trialCount = 0;
            for (int n = 2; n <= N; n++) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    trialCount++;
                    if (n % i == 0) break;
                }
            }
            
            // Sieve Count (Inner loop markings)
            int sieveCount = 0;
            boolean[] isP = new boolean[N + 1];
            for(int i=2; i<=N; i++) isP[i] = true;
            for (int p = 2; p * p <= N; p++) {
                if (isP[p]) {
                    for (int i = p * p; i <= N; i += p) {
                        sieveCount++;
                        isP[i] = false;
                    }
                }
            }
            System.out.println("N = " + N);
            System.out.println("Trial Division: " + trialCount);
            System.out.println("Sieve of Eratosthenes: " + sieveCount);
            System.out.println("---");
        }
    }
}
