package Testing;

public class debugtest {
	
	public debugtest() {
		this(11,12,13);
		System.out.println("Default method");
	}
	public debugtest(int x) {
		this(15,25,35,45);
		System.out.println("one paramatrized method");
	}
	public debugtest(int x, int y) {
		this();
		System.out.println("two paramatrizd method");
	}
	public debugtest(int x, int y, int z) {
		System.out.println("three paramatrizd method");
	}
	public debugtest(int x, int y, int z, int w) {
		this(55,65);
		System.out.println("four paramatrizd method");
	}
	public static void main(String[] args) {
		debugtest Ad = new debugtest(20);
	}
}
