
public class ArrayTest214 {

	public static void main(String[] args) {

//   2차원 배열을 활용해서
//   2행 3열크기에
//   숫자들을
//   1행에 1들만
//   2행에 2들만 입력하고 출력하시오
		
		// 1 2 3
		// 1 2 3
		
		int[][] numArr = new int[2][3];
		
		for(int i = 0; i < 2; i++) {
//		}
			for(int k = 0; k < 3; k++) {
				numArr [0][k] = 1;//[1][0]=2 [1][1] =2 
				numArr [1][k] = 2;//[2][0]=3 [2][1]=3 [2][2]=3
				System.out.println(numArr[i][k] +"\t");
			} 
			
			System.out.println();
			
		}
					
//		numArr[0][0]= 1;
		
	}

}
