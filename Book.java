import java.util.*;
class Book
{
	String name,author;
	double price;
	int num_pages;
	Book()
	{
		name="\0";
		author="\0";
		num_pages=0;
		price=0;
	}
	void set(int j)
	{
		j=j+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the book"+j);
		name = sc.next();
		System.out.println("enter the name of the author of the book"+j);
		author = sc.next();
		System.out.println("enter the price of the book"+j);
		price = sc.nextDouble();
		System.out.println("enter the no. of pages"+j);
		num_pages = sc.nextInt();
	}
	public String toString()
	{
		String s=" name:"+name+"\n author:"+author+"\n Price:"+price+"\n No. of pages"+num_pages;
		return s;
	}
	void get()
	{
		System.out.println(toString());
	}
}
class BookDemo
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the no. of book objects");
		int n = obj.nextInt();
		Book arr[] = new Book[n];
		for (int i=0;i<n;i++)
		{
			arr[i] = new Book();
		}
		for(int i=0;i<n;i++)
		{
			arr[i].set(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of book"+(i+1));
			arr[i].get();
		}
	}
}

/*
Enter the no. of book objects
2
enter the name of the book1
Notebook
enter the name of the author of the book1
Nicholas Sparks
enter the price of the book1
399.00
enter the no. of pages1
256
enter the name of the book2
3 Mistakes of my Life
enter the name of the author of the book2
Chetan Bhagat
enter the price of the book2
450.00
enter the no. of pages2
312
Details of book1
 name:Notebook
 author:Nicholas Spaks
 Price:399.00
 No. of pages256
Details of book2
 name:3 Mistakes of my Life
 author:Chetan Bhagat
 Price:450.00
 No. of pages312
 */