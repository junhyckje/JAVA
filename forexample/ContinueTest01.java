
public class ContinueTest01 {

	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println("주사위의 값은 : "+num+"입니다");
			if(num == 6 ) {
				break;
			}
		}

	}

}
