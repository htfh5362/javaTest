import java.util.Scanner;

public class ArrayTest1 {
	public static void main(String[] args) {

//		배열에 
//		20, 40, 60, 80, 100, 13점을 넣고
//		
//		총점과 평균점수를 구하시오 
//		(평균의 경우 소수점 3번째 자리에서 반올림한다)
//		
//		총점: 313
//		평균: 52.166666,,,
//		평균 반올림: 52.17

		int[] scoreArr = { 20, 40, 60, 80, 100, 13 };
		int sum = 0;
		double average = 0.0;
		double ave = 0.0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			sum = sum + scoreArr[i];
		}
		average = sum / 6.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
        System.out.println("평균 반올림: " + ave);
	}

//	scan.close();
}
