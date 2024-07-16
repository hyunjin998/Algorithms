import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        HashMap <String, Integer> hash = new HashMap<>();
        int N = Integer.parseInt(sc.readLine());

        for(int i=0; i<N; i++){
            String name = sc.readLine();
            if(hash.containsKey(name)){
                int value = hash.get(name);
                hash.put(name, value+1);
            } else hash.put(name, 1);
        }

        for(int i=0; i<N-1; i++){
            String name = sc.readLine();
            int value = hash.get(name) - 1;
            hash.put(name, value);
            if(value == 0) hash.remove(name);
        }

        for(String key : hash.keySet()){
            System.out.println(key);
        }
    }
}