import java.util.*;
public class Maximum
{
public static void main(String args[])
{
Scanner obj = new Scanner(System.in);
System.out.println("Enter the row and column size of a 2D array");
int r = obj.nextInt();
int c = obj.nextInt();
int a[][] = new int[r][c];
System.out.println("Enter the elements of 2D array");
for(int i=0; i<r; i++)
{
for(int j=0; j<c; j++)
a[i][j] = obj.nextInt();
}
int n = a[0][0];
for(int y[]:a)
{
for(int x:y)
{
if(x>n)
n=x;
}
}
System.out.println("the maximum element of array is"+n);
}}

