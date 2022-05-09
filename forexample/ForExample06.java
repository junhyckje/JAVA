
public class ForExample06 {

	public static void main(String[] args) {
		int i =1;
		int sum = 0;
		do
		{
			sum += i;
			i++;
			
		}while(i<=1000);
		System.out.printf("1부터 %d까지 의 합 : %d",i-1,sum);
	}
}