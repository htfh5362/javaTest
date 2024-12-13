
//중첩 for문으로 구현해보자

public class ControlTest161 {

	public static void main(String[] args) {

//	      사각형을 출력하시오
//	      *****
//	      *****
//	      *****
		for (int i = 0; i <= 2; i++) {

			for (int n = 0; n <= i; n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
