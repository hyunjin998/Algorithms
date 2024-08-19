import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sc.readLine());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(sc.readLine());

        Map<Integer, int[]> candidateMap = new HashMap<>(); // {학생 번호: [추천 횟수, 게시된 시간]}
        int time = 0;

        for (int i = 0; i < M; i++) {
            int student = Integer.parseInt(st.nextToken());
            time++;

            if (candidateMap.containsKey(student)) {
                candidateMap.get(student)[0]++;
            } else {
                if (candidateMap.size() == N) {
                    int toRemove = Collections.min(candidateMap.entrySet(),
                            (a, b) -> a.getValue()[0] == b.getValue()[0] ?
                                    Integer.compare(a.getValue()[1], b.getValue()[1]) :
                                    Integer.compare(a.getValue()[0], b.getValue()[0])
                    ).getKey();
                    candidateMap.remove(toRemove);
                }
                candidateMap.put(student, new int[]{1, time});
            }
        }

        List<Integer> result = new ArrayList<>(candidateMap.keySet());
        Collections.sort(result);

        for (int id : result) {
            sb.append(id).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}