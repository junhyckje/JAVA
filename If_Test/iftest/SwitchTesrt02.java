package iftest;

public class SwitchTesrt02 {

	public static void main(String[] args) {
		int time = (int)(Math.random() * 5) + 8;
		switch(time){
		case 8:
			System.out.printf("%d 가 되면 출근을 합니다\n",time);
			break;
		case 9:
			System.out.printf("%d 가 되면 회의을 합니다\n",time);
			break;
		case 10:
			System.out.printf("%d 가 되면 업무을 합니다\n",time);
			break;
		case 11:
			System.out.printf("%d 가 되면 외근을 합니다\n",time);
			break;
		case 12:
			System.out.printf("%d 가 되면 점심을 합니다\n",time);
			break;
			
		}
	}
}
