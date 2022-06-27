package EnumTest;

public class PersonTest01 {
	public static void who(Person a) {
		switch(a) {
		case MAN:
			System.out.println("남성");
			break;
		case WOMAN:
			System.out.println("여성");
			break;
		}
	}

	public static void main(String[] args) {
		who(Person.WOMAN);

	}

}
