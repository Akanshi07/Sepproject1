package Testing;

public class Calculation {

public int Add(int a, int b)
{
	int c;
	c=a+b;
	System.out.println("Addition is: " +c);
	return c;
	
}
public static void main(String[] args) {
	Calculation ab = new Calculation();
	int result=ab.Add(10, 20);
		
}
}
