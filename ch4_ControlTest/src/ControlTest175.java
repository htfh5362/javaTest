
// 반복문 - continue문

import java.util.Scanner;

public class ControlTest175 {

	public static void main(String[] args) {

//		사용자가 입력한 숫자를 모두 누적해서 계산하는 
//	      프로그램 구현
//	      
//	      사용자가 키보드로 입력한다
//	      300
//	      누적금액: 300
//	      
//	      400
//	      누적금액: 700      
//	      
//	      1000
//	      누적금액: 1700
//	      
//	      언젠가는 사용자가 0을 입력하면 최종금액을 출력하고 프로그램 종료
//	      
//	      0을 입력하면
//	      3번 구매한 총 금액은 1700원 입니다.
//	      
//	      구매해 주셔서 감사합니다		
				
		int cont = 0;
		int sum = 0;
		int num = 0;
			
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("숫자를 입력해주세요");
			num = scan.nextInt();
			sum = sum + num;
			cont = cont + 1;
			System.out.println(sum);
			System.out.println(cont);
			
			if (num == cont) {
				System.out.println(num + "번 구매한 총 금액은 " + sum + "원 입니다.");
				System.out.println("구매해 주셔서 감사합니다");
				break;
	        }
			
//			else if() {
//	        	System.out.println(bum + "번 구매한 금액은" + sum);
//	        }else {
//	        	System.out.println( "");
//	        	System.out.println("");
//	        	break;
//	        }

		}
		
//		System.out.println("프로그램 종료");

	}

}
