
//switch

import java.util.Scanner;

public class ControlTest145 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

	    
       
       String ch = "";
       System.out.println("학점을 입력하세요");
       
       int score = scan.nextInt();
       
       
       if(score >= 90) {
    	   ch = "A-";
    	   if(score > 94 && score < 98 ) {
    		  ch = "A";
    	   } else if(score > 98){
    		   ch = "A+"; 
    	   
       }
          
      }
       
         if(score >= 80) {
    	   ch = "B-";
    	   if(score > 84 && score < 88 ) {
    		  ch = "B";
    	   } else if(score >= 88){
    		   ch = "B+"; 
    	   				   
      }
    	          
         }else if (score < 80 ) {
			ch = "C";
		} System.out.println(ch);
  }
}

	




