import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int africanSwallow = Integer.parseInt(st.nextToken());
        int europeanSwallow = Integer.parseInt(st.nextToken());

        double[] african = new double[10];
        double[] european = new double[10];

        int africanIdx = 0;
        int europeanIdx = 0;

        double africanTime = 0;
        double europeanTime = 0;

        for (int i = 0; i < 20; i++) {
            String str = sc.readLine();
            char opt = Character.toLowerCase(str.charAt(0));
            double time = Double.parseDouble(str.substring(2));

            switch (opt) {
                case 'a': {
                    african[africanIdx++] = time;
                    africanTime += time;
                    break;
                }
                case 'e': {
                    european[europeanIdx++] = time;
                    europeanTime += time;
                    break;
                }
            }
        }

        sb.append("Method 1").append('\n');
        sb.append("African: ").append(String.format("%.2f", Method1(africanSwallow, africanTime))).append(" furlongs per hour\n");
        sb.append("European: ").append(String.format("%.2f", Method1(europeanSwallow, europeanTime))).append(" furlongs per hour\n");

        sb.append("Method 2").append('\n');
        sb.append("African: ").append(String.format("%.2f", Method2(african, africanSwallow))).append(" furlongs per hour\n");
        sb.append("European: ").append(String.format("%.2f", Method2(european, europeanSwallow))).append(" furlongs per hour\n");

        System.out.println(sb);
    }

    private static double Method1(double swallowDistance, double totalTime) {
        return swallowDistance * 10 / totalTime;
    }

    private static double Method2(double[] times, double swallowDistance) {
        double sumSpeeds = 0;
        for (double time : times) {
            sumSpeeds += swallowDistance / time;
        } return sumSpeeds / times.length;
    }
}