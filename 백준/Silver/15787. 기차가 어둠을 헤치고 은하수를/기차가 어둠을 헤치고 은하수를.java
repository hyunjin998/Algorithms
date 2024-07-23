import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean train[][];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        N = Integer.valueOf(st.nextToken());
        M = Integer.valueOf(st.nextToken());
        train = new boolean[N+1][21];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(in.readLine());
            int cmd = Integer.valueOf(st.nextToken());
            int tn=0;
            int x=0;
            if(cmd==1 || cmd==2) {
                tn = Integer.valueOf(st.nextToken());
                x = Integer.valueOf(st.nextToken());
            }else {
                tn = Integer.valueOf(st.nextToken());
            }
            if(cmd==1) {
                train[tn][x]=true;
            }else if(cmd==2) {
                train[tn][x] = false;
            }else if(cmd==3) {
                for(int j=20; j>=2; j--) {
                    train[tn][j] = train[tn][j-1];
                }
                train[tn][1]=false;
            }else if(cmd==4) {
                for(int j=1; j<=19; j++) {
                    train[tn][j] = train[tn][j+1];
                }
                train[tn][20]=false;
            }
        }
        Set<String> set = new HashSet<>();
        for(int i=1; i<=N; i++) {
            String tmp="";
            for(int j=1; j<=20; j++) {
                if(train[i][j]) {
                    tmp+='1';
                }else {
                    tmp+='0';
                }
            }
            set.add(tmp);
        }
        System.out.println(set.size());
    }
}