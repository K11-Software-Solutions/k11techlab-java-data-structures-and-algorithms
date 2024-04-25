// Java program to print Fizz Buzz
/*
Fizz Buzz is a very simple programming task, asked in software developer job interviews.

A typical round of Fizz Buzz can be: 
Write a program that prints the numbers from 1 to 100 and for multiples of ‘3’ print “Fizz” instead of the number and for the multiples of ‘5’ print “Buzz”. 
*/

import java.util.*;
class FizzBuzz
{
    public static void main(String args[])
    { 
        int n = 100;
 
        // loop for 100 times
        for (int i=1; i<=n; i++)                                 
        {
            //number divisible by 15(divisible by
            // both 3 & 5), print 'FizzBuzz' in
            // place of the number
            if (i%15==0)                                                 
                System.out.print("FizzBuzz"+" "); 
            // number divisible by 5, print 'Buzz' 
            // in place of the number
            else if (i%5==0)     
                System.out.print("Buzz"+" "); 
 
            // number divisible by 3, print 'Fizz' 
            // in place of the number
            else if (i%3==0)     
                System.out.print("Fizz"+" ");
                 
            else // print the numbers
                System.out.print(i+" ");                         
        }
    }
}
