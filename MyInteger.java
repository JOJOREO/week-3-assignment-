package com.company;

public class MyInteger {
    public int value ;
    public MyInteger()
    {

    }
    public MyInteger(int value)
    {
        this.value= value;
    }
    public int getValue()
    {
        return this.value;
    }
    public boolean IsEven()
    {
        if(value%2==0 )
            return true ;
        else
            return false;
    }
    public boolean IsOdd()
    {
        if(value%2==0 )
            return false ;
        else
            return true;
    }
    public boolean IPrime()
    {
        int flag=0;
        for (int i =value-1 ;i>1;i--)
        {
            if(value % i==0 )
                flag = 0;
            break;
            else
                flag= 1;

        }

        if(flag == 1 )
            return true ;
        else
            return false;
    }
    public static boolean IsEven(int )
    {
        if(z%2==0 )
            return true ;
        else
            return false;
    }
    public static boolean IsOdd(int )
    {
        if(z%2==0 )
            return false ;
        else
            return true;
    }
    public static boolean IPrime(int )
    {
        int flag=0;
        for (int i =z-1 ;i>1;i--)
        {
            if(z % i==0 )
                flag = 0;
            break;
            else
            flag= 1;

        }

        if(flag == 1 )
            return true ;
        else
            return false;
    }

    public boolean IsEven(int myIntegar)
    {
        if(value%2==0 )
            return true ;
        else
            return false;
    }
    public boolean IsOdd(int myIntegar)
    {
        if(value%3==0 )
            return true ;
        else
            return false;
    }
    public boolean IPrime(int myIntegar)
    {
        int flag=0;
        for (int i =value-1 ;i>1;i--)
        {
            if(value % i==0 )
                flag = 0;
            break;
            else
            flag= 1;

        }

        if(flag == 1 )
            return true ;
        else
            return false;
    }

    System.out.println("*************8");


    public boolean Equals()
    {
        if this.value== z;
    }


}
