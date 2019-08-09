import java.util.*;
class Fiabonacci
{
public static void main(String args[])
{
int n;
Scanner obj = new Scanner(System.in);
System.out.print("Enter value of n");
n = obj.nextInt();
fib(n);
}

static void fib(int n) 
{
int i;
int first = 0;
int second = 1;
for(i=0; i<n; i++)
{
int result = first + second;
first = second;
second = result;
System.out.println("Result = " +result);
}
}


}




