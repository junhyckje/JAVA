
public class ContinueTest01 {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("�ֻ����� ���� : "+num+"�Դϴ�");
			if(num == 6 ) {
				break;
			}
		}

	}

}
