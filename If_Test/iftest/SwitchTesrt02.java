package iftest;

public class SwitchTesrt02 {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 5) + 8;
		switch(time){
		case 8:
			System.out.printf("%d �� �Ǹ� ����� �մϴ�\n",time);
			break;
		case 9:
			System.out.printf("%d �� �Ǹ� ȸ���� �մϴ�\n",time);
			break;
		case 10:
			System.out.printf("%d �� �Ǹ� ������ �մϴ�\n",time);
			break;
		case 11:
			System.out.printf("%d �� �Ǹ� �ܱ��� �մϴ�\n",time);
			break;
		case 12:
			System.out.printf("%d �� �Ǹ� ������ �մϴ�\n",time);
			break;
			
		}
	}
}
