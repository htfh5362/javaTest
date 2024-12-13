
public class ArrayTest217 {

	public static void main(String[] args) {

//     1~25 사이의 값들을 중복 인정
//     2차원 배열에 넣는다
//     
//     이들을 중첩 for문을 활용해서
//     행열을 구분하여 출력한다
		
		int[][] numArr = new int[4][6];
		
		for(int i = 0; i < numArr.length; i++) {
			for (int k = 0; k < numArr[i].length; k++) {
				
				numArr[i][k] = numArr[i].length * i + (k+1);
				System.out.print(numArr[i][k] + "\t");
			}
			System.out.println();
		}
		
	}

}
