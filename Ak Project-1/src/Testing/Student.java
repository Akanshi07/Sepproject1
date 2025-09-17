package Testing;

public class Student {
	int age=22;
	int rollno=145;
public void display1()
{
	System.out.println("My age is " +age);
	}
public void display2()
{
	System.out.println("My roll number is " +rollno);
	}
public static void main(String[] args)
{
	Student akanshi=new Student();
	akanshi.display1();
	akanshi.display2();
}
}
