package iftest;

public class IfTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score =65;
		
		if(score >= 90) {
			System.out.printf("������ %d �Դϴ�\n",score);
		    System.out.println("����� A �Դϴ�");
		} else if(score >= 80) {
			System.out.printf("������ %d �Դϴ�\n",score);
	        System.out.println("����� B �Դϴ�");
		} else if(score >= 70) {
			System.out.printf("������ %d �Դϴ�\n",score);
			System.out.println("����� C �Դϴ�");
		} else {
			System.out.printf("������ %d �Դϴ�\n",score);
			System.out.println("����� D �Դϴ�");
		}
	}
}