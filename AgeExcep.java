/*Write a program that demonstrates handling of exceptions in inheritance tree. Create a base class called “Father” and derived class called “Son” which extends the base class. In Father class, implement a constructor which takes the age and throws the exception WrongAge( ) when the input age=father’s age.*/


import java.util.*;
class InvalidAgeException extends Exception{}
class AgeException extends Exception{}
class Father
    {
    int f_age;
    Father() throws InvalidAgeException
        {
        Scanner se=new Scanner(System.in);
        System.out.println("Enter Father's age:");
        int f_age=se.nextInt();
            if (f_age<=0)
                {
                throw new InvalidAgeException();
                }
         this.f_age=f_age;
        }
     }
     
class Son extends Father
    {
    int s_age;int f_age;
    Son() throws AgeException,InvalidAgeException
        {
         super();
        
        Scanner se=new Scanner(System.in);
        System.out.println("Enter Son's age and Father's age:");
        int s_age=se.nextInt();
        int f_age=se.nextInt();
        if (s_age>=f_age)
            {
            throw new AgeException();
            }
         this.s_age=s_age;
         this.f_age=super.f_age;
        }
    }
    
class AgeExcep
    {
    public static void main(String args[])
        {
        try
            {
            Son ob=new Son();
            System.out.println("Sons's age:"+ob.s_age+"Father's age:"+ob.f_age);
            }
        catch(InvalidAgeException e1)
            {
            System.out.println("error 2");
            }
        catch(AgeException e)
            {
            System.out.println("error");
            }
           }
       }