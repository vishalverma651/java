package Switch;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;

		switch (n) {

		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");   // if we do not use break than it will be printing three,four and five
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
			}
	}

}
