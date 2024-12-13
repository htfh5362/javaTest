
// 올림처리 구현하기
public class OperatorTest105 {

	public static void main(String[] args) {

        double num = 3.141592;
		double resultNum = 0.0;
				
	    resultNum = (int)(num * 100 + 1) / 100.0;
		
		System.out.println("소수점 3번째 자리에서 올림 즉 2자리까지만 출력");
		System.out.println(num + "->" + resultNum);
		
	}

}
