import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(sc.readLine());
        boolean[] primes = isPrime(100000);

        while (T-- > 0) {
            int N = Integer.parseInt(sc.readLine());

            for (int i = 2; i <= N; i++) {
                if (!primes[i]) {
                    int count = 0;
                    while (N % i == 0) {
                        count++;
                        N /= i;
                    }
                    if (count != 0)
                        sb.append(i).append(" ").append(count).append('\n');
                }
            }
        } System.out.println(sb);
    }

    static boolean[] isPrime(int num) {
        boolean[] isPrime = new boolean[num + 1];
        for (int i = 2; i * i <= num; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    isPrime[j] = true;
                }
            }
        } return isPrime;
    }
}