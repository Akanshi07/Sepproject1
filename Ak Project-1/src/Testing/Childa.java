package Testing;

public class Childa extends Parent
{
	int def;
	public void methodc()
{
		System.out.println("childa");

}
	public static void main(String[] args) 
{
	Childa ch= new Childa();
	ch.method1();
	ch.abc = 123;
	ch.def= 456;
	ch.methodc();
	System.out.println("Value of parent variable " + ch.abc);
	System.out.println("Value of Childa variable " + ch.def);
}
	
}
