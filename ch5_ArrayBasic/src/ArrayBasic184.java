
public class ArrayBasic184 {

	public static void main(String[] args) {
  
//	* 배열(Array) : 같은 자료형 변수들의 묶음
//	  배열의 초기화 (1)
		
		int[] scores = {85, 89, 94, 90, 100};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		// 배열의 초기화 (2)
		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		numbers[2] = 1000;
		System.out.println(numbers[2]);
		
		System.out.println(numbers);
		int sum = 0;
	    for (int i = 0; i < scores.length; i++){
	    	sum += scores[i];
	    	System.out.println(scores[i]);
	    	
	    }
	     System.out.println("합계:" + sum / scores.length);
		
	}

}
