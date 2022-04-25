package iftest;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score =65;
		
		if(score >= 90) {
			System.out.printf("점수는 %d 입니다\n",score);
		    System.out.println("등급이 A 입니다");
		} else if(score >= 80) {
			System.out.printf("점수는 %d 입니다\n",score);
	        System.out.println("등급이 B 입니다");
		} else if(score >= 70) {
			System.out.printf("점수는 %d 입니다\n",score);
			System.out.println("등급이 C 입니다");
		} else {
			System.out.printf("점수가 %d 입니다\n",score);
			System.out.println("등급이 D 입니다");
		}
	}
}