
//switch

import java.util.Scanner;

public class ControlTest146 {

	public static void main(String[] args) {

//		한국의 4계절을 출력하는 프로그램 구현
//      
//      사용자로부터 값을 달을 입력받는다
//      
//      4를 입력받으면
//      
//      4월은 봄입니다 라고 출력된다
//      
//      만약 12를 입력받으면
//      12월은 겨울입니다 라고 출력한다 
		
	    Scanner scan = new Scanner(System.in);
	    int toss = 0;
	    String ch = "";
	     System.out.println("달을 입력하세요");
	     toss = scan.nextInt();
	     
	     switch (toss) {
	     
			case 1:			
			case 2:							   
			case 12:
				ch = toss + "월은 겨울입니다.";
				break;
			case 3:
			case 4:
		    case 5:
				ch = toss + "월은 봄입니다.";
				break;
			case 6:			
			case 7:				
			case 8:
				ch = toss + "월은 여름입니다";
				break;
			case 9:				
			case 10:								
			case 11:
				ch = toss + "월은 가을입니다.";
				break;			
			default:
				break;
		}
	     System.out.println(ch);

	}

}


