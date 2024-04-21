import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N; // 맵의 크기
	static int M; // 맵의 크기
	static int D; // 궁수가 때릴 수 있는 거리

	static int[][] array; // 맵
	static int[] archer = new int[3]; // 궁수는 3명

	static int max = 0; // 어차피 음수값은 나오지 않으니 max의 초기값은 0으로 설정

	public static void main(String[] args) throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(sc.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());

		array = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(sc.readLine());
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		pick(0, 0);
		// max 출력
		System.out.println(max);

	}

	// 궁수 위치 지정해주는 함수
	private static void pick(int k, int idx) {
		// basis part
		if (k == archer.length) {
			max = Math.max(max, move());
			return;
		}

		// inductive part
		for (int i = idx; i < M; i++) {
			archer[k] = i;
			pick(k + 1, i + 1);
		}

	}

	// 궁수가 이동하면서 싸운다
	private static int move() {
		int kill = 0; // 죽인 수
		int[][] status = new int[N][M]; // 맵의 업데이트되는 상태를 저장해주는 이차원 배열

		// 궁수가 밑에서부터 이동한다
		for (int archerX = N; archerX > 0; archerX--) {
			for (int archerY : archer) { // 궁수의 위치를 담은 일차원 배열 archer 안의 값에 접근
				// archrX, archerY 담았으면 D를 참고해 때린다
				for (int d = 1; d <= D; d++) {
					// cnt는 나중에 kill에 더해줄 변수. kill과 비슷함
					// 본격적으로 싸울건데 현재 업데이트 된 상태와 d, 궁수의 x, y 좌표를 보낸다.
					int cnt = Fight(status, d, archerX, archerY);
					
					
					if(cnt < 0) {  // 죽인 사람이 없다???
						continue;
					}
					// 아니라면 죽인 사람들을 kill에 넣는다.
					kill += cnt;
					break;  // 위에 continue 나왔으니까 break
				}

			}
		}

		return kill;
	}

	private static int Fight(int[][] status, int d, int archerX, int archerY) {
		for(int y = archerY-d; y <= archerY+d; y++) {
			int x = archerX - (d- Math.abs(y-archerY));
			
			// 범위체크하는데, 원본배열에 적이 있을때 !! (array[x][y] == 1)
			if(x>=0 && x<archerX && y>=0 && y<M && array[x][y] != 0) {
				if(status[x][y] == 0) {
					status[x][y] = archerX;
					return 1;
				}
				if(status[x][y] == archerX)
					return 0;
			}

		}
		return -1;
	}

}