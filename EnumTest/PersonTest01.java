package EnumTest;

public class PersonTest01 {
	public static void who(Person a) {
		switch(a) {
		case MAN:
			System.out.println("����");
			break;
		case WOMAN:
			System.out.println("����");
			break;
		}
	}

	public static void main(String[] args) {
		who(Person.WOMAN);

	}

}
