package com.mkyong.hashing;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EvenOdd ob=new EvenOdd();
	System.out.println(ob.checkEven(Integer.parseInt(args[0])));

    }
}
