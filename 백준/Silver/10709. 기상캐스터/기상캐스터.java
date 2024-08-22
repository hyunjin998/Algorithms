import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        StringBuilder sb = new StringBuilder();

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        Character[][] array = new Character[H][W];
        for(int i=0; i<H; i++){
            String str = sc.readLine();
            boolean cloud = false;
            int time = 0;

            for(int j=0; j<W; j++){
                array[i][j] = str.charAt(j);

                if(cloud) time++;
                else time = -1;

                if(array[i][j] == 'c') {
                    cloud = true;
                    time = 0;
                } sb.append(time).append(' ');
            } sb.append('\n');
        } System.out.println(sb);
    }
}