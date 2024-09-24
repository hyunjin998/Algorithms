import java.util.*;

public class Main {
    static long w, h, k;

    public static boolean check(long height, long wide) {
        return height * wide <= k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        w = sc.nextLong();
        h = sc.nextLong();
        k = sc.nextLong();

        int n = sc.nextInt();
        ArrayList<Long> height = new ArrayList<>();
        ArrayList<Long> blockH = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            height.add(sc.nextLong());
            if (i != 0) {
                blockH.add(height.get(i) - height.get(i - 1));
            } else {
                blockH.add(height.get(i));
            }
        }
        blockH.add(h - height.get(n - 1));

        int m = sc.nextInt();
        ArrayList<Long> wide = new ArrayList<>();
        ArrayList<Long> blockW = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            wide.add(sc.nextLong());
            if (i != 0) {
                blockW.add(wide.get(i) - wide.get(i - 1));
            } else {
                blockW.add(wide.get(i));
            }
        }
        blockW.add(w - wide.get(m - 1));

        Collections.sort(blockW);

        long ret = 0;

        for (long blockHeight : blockH) {
            long left = 0;
            long right = blockW.size() - 1;

            while (left <= right) {
                long mid = (left + right) / 2;
                if (check(blockHeight, blockW.get((int) mid))) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            ret += left;
        }

        System.out.println(ret);
    }
}