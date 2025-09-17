package Testing;

public class cal {
	int a =10;
	int b =20;
public int Add()
	{
		int c;
		c=a+b;
		return c;
	}
public void Sub()
{
	int d;
	d=b-a;
	System.out.println("Subtraction is: " +d);
}
public void Mul()
{
	int e;
	e=a*b;
	System.out.println("Muliplicaion is: " +e );
}
public void Div()
{
	int f;
	f=b/a;
	System.out.println("Division is: " +f );
}
	public static void main(String[] args) {
		cal ab = new cal();
		System.out.println("Addition is: " +ab.Add());
		ab.Sub();
		ab.Mul();
		ab.Div();
	}
}
