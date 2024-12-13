
public class varTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      자신의 이름과 취미, 생년월일, 나이를 출력하시오
	      
//      이름: ???
//      취미: ???
//      생년월일: 1987
//      나이: 현재년도에서 생년월일을 뺀 값을 출력
		
		String name = "박진우";
		String hobby = "게임";
		int birth = 1993;
		int age = 2024 - birth  + 1; 
		
		
		System.out.println("이름: "+ name);
		System.out.println("취미: " + hobby);
		System.out.println("생년월일: " + birth);
		System.out.println("나이: " + age);
	}

}
