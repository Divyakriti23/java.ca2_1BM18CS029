import java.util.*;
class Quadratic
{
public static void main(String args[])
{
int a,b,c,d;
double x1, x2;
Scanner obj = new Scanner(System.in);
System.out.print("Enter the value of a");
a = obj.nextInt();
System.out.print("Enter the value of b");
b = obj.nextInt();
System.out.print("Enter the value of c");
c = obj.nextInt();
d = (b*b-(4*a*c));
if(d==0)
{
System.out.println("Roots are equal");
x1 = (-b/(2*a));
System.out.println("x = "+x1);
}
else if(d>0)
{
System.out.println("Roots are real");
x1 = (-b+(Math.sqrt(d))/(2*a));
x2 = (-b-(Math.sqrt(d))/(2*a)); 
System.out.println("x1 = "+x1+" and x2 = "+x2);
}
else
{
System.out.println("Roots are imginary");
}
}}


