import java.io.*;
import java.util.*;

public class Main {
    static class Runner {
        String name;
        double a; // Time for the 1st leg
        double b; // Time for any other leg

        Runner(String name, double a, double b) {
            this.name = name;
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(sc.readLine().trim());
        List<Runner> runners = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(sc.readLine().trim());
            String name = st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            runners.add(new Runner(name, a, b));
        }

        // Sort runners by their 'b' time in ascending order (best for 2nd, 3rd, and 4th legs)
        runners.sort(Comparator.comparingDouble(r -> r.b));

        double bestTime = Double.MAX_VALUE;
        List<Runner> bestTeam = null;

        // Iterate through all possible combinations of 3 runners for the 2nd, 3rd, and 4th legs
        for (int i = 0; i < n; i++) {
            Runner leg1 = runners.get(i);

            // Use PriorityQueue to find the fastest 3 runners for the 2nd, 3rd, and 4th legs
            PriorityQueue<Runner> pq = new PriorityQueue<>(Comparator.comparingDouble(r -> r.b));

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                pq.add(runners.get(j));
            }

            // Get the top 3 runners from the PriorityQueue
            List<Runner> remainingRunners = new ArrayList<>();
            while (remainingRunners.size() < 3 && !pq.isEmpty()) {
                remainingRunners.add(pq.poll());
            }

            if (remainingRunners.size() == 3) {
                double totalTime = leg1.a + remainingRunners.get(0).b + remainingRunners.get(1).b + remainingRunners.get(2).b;

                if (totalTime < bestTime) {
                    bestTime = totalTime;
                    bestTeam = new ArrayList<>(Arrays.asList(leg1, remainingRunners.get(0), remainingRunners.get(1), remainingRunners.get(2)));
                }
            }
        }

        if (bestTeam != null) {
            System.out.printf("%.6f\n", bestTime);
            for (Runner runner : bestTeam) {
                System.out.println(runner.name);
            }
        }
    }
}