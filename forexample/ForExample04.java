
public class ForExample04 {

	public static void main(String[] args) {
		for(int a = 2; a<=100 ; a++ ) {
			System.out.printf("\n   %d ´Ü  \n\n",a);
			for(int b = 1; b<=9 ; b++) {
				System.out.printf("%d * %d : %d \n",a,b,a*b);
			}
		}
	}
		
}