/*Write a program to demonstrate generics with multiple object parameters*/

import java.util.*;

class Operations<T,V>
    {
    T t;
    V v;
    
    Operations(T t, V v)
        {
        this.t=t;
        this.v=v;
        }
    void operate_t()
        {
        System.out.println("THIS ADDS THE TWO PARAMETERS:"+t+v);
        }
        
    V operate_v()
        {
        return v;
        }
        
    }
    
class Generics
    {
    public static void main(String args[])
        {
        Operations <Integer,String> ob=new Operations(5,"Hello");
        Operations <Float,String> ob1=new Operations(2.2,"Bye");
        
        ob.operate_t();
        System.out.println(ob.operate_v());
        ob1.operate_t();
        System.out.println(ob1.operate_v());
        }
    }