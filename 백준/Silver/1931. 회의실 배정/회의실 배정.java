import java.util.Arrays;
import java.util.Scanner;

// 회의실 배정 
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  // 회의의 수
		
		// 회의의 시간을 저장할 배열 선언
		// 시작시간과 종료시간을 받아야 하므로 2차원 배열, 열의 크기는 2 
		int[][] Array = new int[N][2];
		for (int i =0; i <N; i++) {
			Array[i][0] = sc.nextInt();  // 시작 시간 
			Array[i][1] = sc.nextInt();  // 종료 시간 
		}
		
		Arrays.sort(Array, (o1, o2) -> {
			if(o1[1] == o2[1]) {  // 종료시간이 같을 경우
				return o1[0] - o2[0];  // 시작시간 기준으로 오름차순 정렬 
			}
			return o1[1]-o2[1];  // 종료시간을 기준으로 오름차순 정렬 
		});
		
		int cnt = 0;  // 회의실의 최대 갯수 
		int end = 0;  // 끝나는 시간 
		
		for (int i=0; i<N; i++) {
			// 종료 시간이 다음 회의 시작 시간보다 작거나 같으면
			// 종료 시간은 다음 회의의 끝나는 시간 
			if(end <= Array[i][0]) {
				end = Array[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
