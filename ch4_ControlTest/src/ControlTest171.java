
//while문

public class ControlTest171 {

	public static void main(String[] args) {

//		  1 - 1
//	      2 - 3
//	      3 - 6
//	      4 - 10
//	      5 - 15
//	      ,
//	      ,
//	      ,
//	      11 - 66
//	      12 - 78
//	      13 - 91
//	      
//	      로 출력하면 되는데 
//	      내용은 1부터 100까지 모든 수를 더하는데 최초로 100을 초과하기
//	      전의 연산 과정을 출력하시오
		
		int ex = 1;
		int sum = 0;
		
		while (sum < 100) {
			sum = ex + sum;
			if(sum < 100)
			System.out.println(ex + " - " + sum);
			ex++;
			System.out.println();
		}

	}

}
