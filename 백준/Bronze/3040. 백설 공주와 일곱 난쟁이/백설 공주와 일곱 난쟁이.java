import java.util.Scanner;

// 백설 공주와 일곱 난쟁이
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[9]; // 현재 난쟁이 9명
		int sum = 0;
		
		// 배열 Array에 난쟁이 9명의 수 저장
		for (int i = 0; i < 9; i++) {
			Array[i] = sc.nextInt();
			sum += Array[i];
		}

		int[] tmp = new int[2];  // 9개의 수에서 2개만 빼면 되니까 그 2개를 받을 크기 2의 배열 선언
		L:for (int i = 0; i < 9; i++) {
			sum -= Array[i];
			for (int j = i + 1; j < 9; j++) {
				sum -= Array[j];
				if(sum == 100) {
					tmp[0] = Array[i];
					tmp[1] = Array[j];
                    break L;
				}
				//else {
				sum += Array[j];
				//}
			}
			sum += Array[i];
		}
		
		/* 
		for (Integer a : Array) {
			if(a != tmp[0] && a != tmp[1]) {
				System.out.print(a + " ");
			}
		} */
		
		String str = new String();
		for (int i=0; i<9; i++) {
			if(Array[i] != tmp[0] && Array[i] != tmp[1]) {
				//System.out.println(Array[i]);
				str += Array[i]+" ";
			}
		}
		str = str.trim().replace(' ', '\n');
		System.out.print(str);
	}
}