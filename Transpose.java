import java.util.*;
public class Transpose
{
public static void main(String args[])
{
int m, n;
Scanner obj = new Scanner(System.in);
System.out.print("Enter m");
m = obj.nextInt();
System.out.print("Enter n");
n = obj.nextInt();
int a[][] = new int[m][n];
System.out.print("Enter the elements of array");
for(int i=0; i<m; i++)
{
for(int j=0; j<n; j++)
{
a[i][j] = obj.nextInt();
}}
for(int i=0; i<n; i++)
{
for(int j=0; j<m; j++)
{
a[i][j] = a[j][i];
}}
for(int i=0; i<n; i++)
{
for(int j=0; j<m; j++)
{
System.out.print(a[i][j]);
}
System.out.print(" ");
}
}}