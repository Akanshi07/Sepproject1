package Testing;

public class Arithmetic1 {
	
	public int mul (int l, int k)
	{
		int j;
		j=l*k;
		System.out.println("Multiply is:"+j);
		return j;
	}
	public int sum (int p, int o)
	{
		int i;
		i=p+o;
		System.out.println("Addition is:"+i);
		return i;
	}
public int sub (int u, int t)
{
	int r;
	r=u-t;
	System.out.println("Subtraction is:"+r);
	return r;
	
}
public int div (int m, int n)
{
	int v;
	v=m/n;
	System.out.println("Subtraction is:"+v);
	return v;
	
}
public static void main(String[] args) {
	Arithmetic1 RE=new Arithmetic1();
	int mulResult=RE.mul(10,3);
	int sumResult=RE.sum(mulResult,2);
	int mulResult2=RE.mul(sumResult,4);
	int subResult=RE.sub(mulResult2,4);
	int divResult=RE.div(subResult,2);
	
	
}
}
