package Testing;

public class Arithmetic {

public int sum (int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition is:"+c);
		return c;
	}
public int sub (int x, int y)
{
	int z;
	z=x-y;
	System.out.println("Subtraction is:"+z);
	return z;
}
public int mul (int w, int e)
{
	int d;
	d=w*e;
	System.out.println("Multiply is:"+d);
	return d;
}
public int div (int f, int g)
{
	int h;
	h=f/g;
	System.out.println("Subtraction is:"+h);
	return h;
	
}
public static void main(String[] args) {
	Arithmetic ob=new Arithmetic();
	int sumResult=ob.sum(10,2);
	int sumResult2=ob.sum(sumResult,2);
	int subResult=ob.sub(sumResult2,2);
	int mulResult=ob.mul(subResult,2);
	int divResult=ob.div(mulResult,2);
	
	
}
}
