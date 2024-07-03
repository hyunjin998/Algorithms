import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());
        String[] electricalShocks = {"he", "she", "him", "her"};

        int N = Integer.parseInt(st.nextToken());
        String[] array = new String[N];

        st = new StringTokenizer(sc.readLine());
        int cnt = 0;
        
        for(int i=0; i<N; i++){
            array[i] = st.nextToken();
            for(int j=0; j<electricalShocks.length; j++){
                if(array[i].equals(electricalShocks[j])) cnt++;
            }
        } System.out.println(cnt);
    }
}