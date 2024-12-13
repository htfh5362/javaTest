

//기본형 타입
import java.util.Scanner;

public class VarBasicTest74 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		// 실수 하나를 키보드 입력을 받는다
		
		// 23.234
		
		int num = 0;
		double scanNum = 0;
		int temp = 0;
		num = 100;
		temp = num;
		
		System.out.println("실수 하나를 입력 하세요");
		
		 
		scanNum = scan.nextDouble();
		
		num = (int)scanNum;
		scanNum = temp;
		
		System.out.println("num " + num);
		System.out.println("scanNum " + scanNum);
		
	    
	    
	  
		
		// 서로 값이 달라진다고 쳐도 일단 그냥 두 숫자가 바뀌어서 출력되면 성공이다


}


    
      
   }
   

