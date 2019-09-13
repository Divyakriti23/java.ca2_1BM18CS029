import java.util.*;
class Person
{
	protected String name, address;
	protected int age;
	Scanner sc = new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter the Name, Age and Address");
		name = sc.next();
		age = sc.nextInt();
		address = sc.next();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}
}
class Student extends Person
{
	protected int roll_no, sem;
	void getdata1()
	{
		System.out.println("Enter Roll_no and Sem");
		roll_no = sc.nextInt();
		sem = sc.nextInt();	
	}
	void display1()
	{
		System.out.println("Roll_no:"+roll_no);
		System.out.println("Sem:"+sem);
	}
}
class Exam extends Student
{
	protected int marks1, marks2;
	protected float avg;
	void getdata2()
	{
		System.out.println("Enter the marks1 and marks2");
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
	}
	float compute()
	{
		avg = ((marks1)*(marks2)/(2));
		return avg;
	}
	void display2()
	{
		System.out.println("marks1:"+marks1);
		System.out.println("marks2:"+marks2);
		System.out.println("Average:"+avg);
	}
}
class PersonDemo
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = obj.nextInt();
		Exam e[] = new Exam[n];         /*creating object of Exam class*/
		for(int i=0; i<n; i++)
		{
			e[i]=new Exam();	/*allocating space for each object in array*/
			System.out.println("Enter the details of the student"+(i+1));
			e[i].getdata();
			e[i].getdata1();
			e[i].getdata2();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println("Details entered are:");
			e[i].display();
			e[i].display1();
			e[i].display2();
		}
		int top=0;                     /*initializing topper = 0*/
		float val = e[0].compute();      
		for(int i=0; i<n; i++)
		{
			if(e[i].compute()>val)
			{
				top=i;
			}
		}
		System.out.println("Details of the topper are:");
		e[top].display();
		e[top].display1();
		e[top].display2();
	}
}

			
