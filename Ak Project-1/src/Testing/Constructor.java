package Testing;

public class Constructor {

	public Constructor() {
		System.out.println("Default Constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("one paramatrized Constructor");
	}
	public Constructor(int a, int b) {
		this(15);
		System.out.println("two paramatrizd Constructor");
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor(20,30);
	}
}
