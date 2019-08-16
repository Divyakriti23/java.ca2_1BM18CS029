import java.util.*;
class Ascend
{
public static void main(String args[])
{
int size;
Scanner obj = new Scanner(System.in);
System.out.print("Enter the size of array");
size = obj.nextInt();
int a[] = new int[size];
System.out.print("Enter the elements of array");
for(int i=0; i<size; i++)
a[i] = obj.nextInt();
for(int i=0; i<size; i++)
{
for(int j=1; j<size; j++)
{
if (a[j-1]>a[j])
{
int t = a[j-1];
a[j-1]=a[j];
a[j]=t;
}
}
}
System.out.println("Array in ascending order is");
for(int x:a)
System.out.println(x);
}}
