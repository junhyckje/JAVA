package iftest;

public class IfTest01 {

	public static void main(String[] args) {
		int score =100;
		
		if(score >= 90) {
			System.out.printf("점 %d 보다 큽니다\n",score);
		    System.out.println("등급이 A 입니다");
		} else if(score >= 80) {
			System.out.printf("점수가 %d 보다 큽니다\n",score);
	        System.out.println("등급이 B 입니다");
		} else if(score >= 70) {
			System.out.printf("점수가 %d 보다 큽니다\n",score);
			System.out.println("등급이 C 입니다");
		} else {
			System.out.printf("점수가 %d 보다 큽니다\n",score);
			System.out.println("등급이 D 입니다");
		}
	}
}
		
        
