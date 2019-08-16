import java.util.*;
class Matrices
{
public static void main(String args[])
{

Scanner obj = new Scanner(System.in);
System.out.print("Enter the size of rows and columns of matrix A");
int ra = obj.nextInt();
int ca = obj.nextInt();
System.out.print("Enter the size of rows and columns of matrix B");
int rb = obj.nextInt();
int cb = obj.nextInt();
int a[][] = new int[ra][ca];
int b[][] = new int[rb][cb];
int sum[][] = new int[ra][cb]; 
int diff[][] = new int[ra][cb];
if(ra==rb && ca==cb)
{
System.out.print("Enter the elements of matrix A");
for(int i=0; i<ra; i++)
{
for(int j=0; j<ca; j++)
a[i][j] = obj.nextInt();
}
System.out.print("Enter the elements of matrix B");
for(int i=0; i<rb; i++)
{
for(int j=0; j<cb; j++)
b[i][j] = obj.nextInt();
}
for(int i=0; i<ra; i++)
{
for(int j=0; j<ca; j++)
{
sum[i][j] = a[i][j]+b[i][j];
diff[i][j] = a[i][j]-b[i][j];
}
}
System.out.println("The sum of matrix A and B is");
for(int i=0; i<ra; i++)
{
for(int j=0; j<ca; j++)
System.out.print(sum[i][j]+" ");
System.out.print("");
}
System.out.println("Difference of matrix A and B is");
for(int i=0; i<rb; i++)
{ 
for(int j=0; j<cb; j++)
System.out.print(diff[i][j]+" ");
System.out.print(" ");
}}
else
{
System.out.println("the row and column size is not equal");
}
}
}

