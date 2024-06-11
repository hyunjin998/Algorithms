import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] Array = new double[N];
		double max = 0;
		for(int i=0; i<N; i++) {
			Array[i] = sc.nextDouble();
			max = Math.max(max, Array[i]);
		}
		
		double sum =0;
		for(int i=0; i<N; i++) {
			Array[i] = Array[i]/max * 100;
			sum += Array[i];
		}
		
		System.out.println((double)sum/(double)N);
	}
}
