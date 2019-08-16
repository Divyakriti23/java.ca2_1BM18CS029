import java.util.*;
class Rectangle
{
	
	int length, width;
	void input()
	{
		Scanner obj = new Scanner(System.in);
		length = obj.nextInt();
		width = obj.nextInt();
	}
	double area()
	{
	return(length*width);
	}
	void print()
	{
		System.out.println("Length = "+length);
		System.out.println("Width = "+width);
		System.out.println("Area = "+area());
	}
	}
	class Area
	{
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		System.out.println("Enter the length and width of the rectangle 1");
		r1.input();
		r1.print();
		System.out.println("Enter the lenght and width of the rectangle 2");
		r2.input();
		r2.print();
	}}
