package iftest;

public class IfTest01 {

	public static void main(String[] args) {
		int score =100;
		
		if(score >= 90) {
			System.out.printf("�� %d ���� Ů�ϴ�\n",score);
		    System.out.println("����� A �Դϴ�");
		} else if(score >= 80) {
			System.out.printf("������ %d ���� Ů�ϴ�\n",score);
	        System.out.println("����� B �Դϴ�");
		} else if(score >= 70) {
			System.out.printf("������ %d ���� Ů�ϴ�\n",score);
			System.out.println("����� C �Դϴ�");
		} else {
			System.out.printf("������ %d ���� Ů�ϴ�\n",score);
			System.out.println("����� D �Դϴ�");
		}
	}
}
		
        
