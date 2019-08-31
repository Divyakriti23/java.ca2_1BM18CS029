import java.util.*;
class Matrix
{
 	double a[][] = new double[2][2];
	Matrix()
	{
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j] = 0;
			}
		}
	}
	Matrix(Matrix ob)
	{
		for(int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j]=ob.a[i][j];
			}
		}
	}
	Matrix(double x[][])
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=x[i][j];
			}
		}
	}
	double det()
	{
		return ((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));
	}
	void inverse()
	{
		if(det()==0)
		{
			System.out.print("Inverse does not exists");
		}
		else
		{
		System.out.print("Inverse Exists and is given by\n"); 
		double ai[][] = new double[2][2];
		double temp = a[0][0];
		a[0][0] = a[1][1];
		a[1][1] = temp;
		a[0][1] = -a[0][1];
		a[1][0] = -a[1][0];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				ai[i][j] = a[i][j]/det();
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		}
	}
	boolean is_singular()
	{
		if(det()==0)
			return true;
		else
			return false;
	}
	void print()
	{
		System.out.println("The matrix is");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{	
			System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Determinant: Determinant is "+det());
		System.out.print("Inverse:");
		inverse();
		System.out.println("Singular:"+is_singular());
		
	}
}
class Det
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double mat[][]= new double[2][2];
		System.out.println("Enter the 2X2 matrix");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				mat[i][j] = sc.nextDouble();
			}
		}
		Matrix m = new Matrix(mat);
		Matrix m1= new Matrix(m);
		m.print();
		m1.print();
	}
}