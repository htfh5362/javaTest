
//조건문

import java.util.Scanner;

public class OperatorlTest142 {

	public static void main(String[] args) {

//   학점을 구해주는 프로그램을 구현하시오
		
//		키보드 입력으로 학점을 받는다
//		
//		점수가
//		100점 이하 90점 이상은A
//		89점 이하 80 이상은 B
//		79점 이하 70 이상은 C
//		그 외 나머지 점수는 F
//		
//		출력형태
//		89점은 B학점입니다.
//      result는 값에 "F" 문자열을 변수에 담았다
//      String result는 변수선언하기 위한 값(?)
//      scan.nextInt();는 인트값 키보드 입력
		
		
	     Scanner scan = new Scanner(System.in);
	     int score = 0;
	     String result = "";
	     System.out.println("점수를 입력해주세요.");
	     
	     score = scan.nextInt();
	     
	     	     
	     if(score >= 90) {
	    	 System.out.println(score + "은 A학점입니다.");	    	 
	     }else if(score >= 80) {
	    	 System.out.println(score + "은 B학점입니다.");
	     }else if(score >= 70) {
	    	 System.out.println(score + "은 C학점입니다.");
	     }
	     else{
	    	 System.out.println(score + "은 F학점입니다.");
	     }


	}

}


