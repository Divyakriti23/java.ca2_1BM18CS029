import java.util.*;
class Account
{
	String name;
	int custom_num;
	float balance;
	void get_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details\n");
		name = sc.next();
		custom_num = sc.nextInt();
		balance = sc.nextFloat();
	}
	void display()
	{
		System.out.println("Details are:\n");
		System.out.println("Name:\n"+name);
		System.out.println("Custom_num:\n"+custom_num);
		System.out.println("Balance:\n"+balance);
	}
}
class Savings extends Account
{
	int time;
	float rate;
	void input()
	{    
        	get_data(); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time and rate");
		time = sc.nextInt();
		rate = sc.nextFloat();
	}
	float compute()
	{
		return((balance*rate*time)/100);
	}
	void output()
	{
		display();
		float r = compute();
		System.out.print("interest : "+r);
	}
}
class AccountDemo extends Savings
{
	public static void main(String args[])
	{
		Savings a = new Savings();
		a.input();
		a.output();
	}
}

