import java.util.*;
class Vehicle
{
	String model, color;
	int year;
	static int total_no;
	Vehicle(String m, String c, int yr)
	{
		model=m;
		color=c;
		year=yr;
		total_no++;
	}
	void output()
	{
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Year : "+year);
	}
	static void out ()
	{
		System.out.println("Total number of vehicles : "+total_no);
	}
}
class VehicleDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vehicles");
		int n = sc.nextInt();
		Vehicle v[] = new Vehicle[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the model, color, year of Vehicle"+(i+1));
			String m = sc.next();
			String c = sc.next();
			int yr = sc.nextInt();

			v[i] = new Vehicle(m, c, yr);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("Details of the Vehicle : "+(i+1));
			v[i].output();
		}
		Vehicle.out();
	}
}

