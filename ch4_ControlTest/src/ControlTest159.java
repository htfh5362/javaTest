
//switch
public class ControlTest159 {

	public static void main(String[] args) {

//    for(int c = 1; c >= 1; c++) {
//    System.out.println(c);
//   }
		// 1
		// 1+2
		// 1+2+3
		// 1+2+3+4
		// 1+2+3+4+5
		int sum = 0;
		for (int d = 1; d <= 5; d++) {
			sum = sum + d;// 1
			// 1= 0 + 1
			// 3= 1 + 2
			// 6= 3 + 3
			// 10 = 6 + 4
			// 15 = 10 + 5

			System.out.println("1부터 "+ d +"까지의 합:" + sum);			
		}            
	}

}
