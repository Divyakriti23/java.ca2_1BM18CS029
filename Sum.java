import java.util.*;
public class Sum
{
public static void main(String args[])
{
int size, sum = 0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array");
size = sc.nextInt();
int a[] = new int[size];
System.out.print("Enter the elements of array");
for(int i=0; i<size; i++)
{
a[i]= sc.nextInt();
sum = sum + a[i];
}
System.out.println("Sum = "+sum);
}}
