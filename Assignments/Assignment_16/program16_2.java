///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckEvenOdd
//  Description  : This method checks whether the given number
//                 is even or odd and prints the result.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckEvenOdd(int iNum)
    {
        if(iNum % 2 == 0)
        {
            System.out.println(iNum + " is Even Number");
        }
        else
        {
            System.out.println(iNum + " is Odd Number");
        }
    }
}

//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program16_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckEvenOdd(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  10    Output : 10 is Even Number
//  Input :  7     Output : 7 is Odd Number
//  Input :  0     Output : 0 is Even Number
//  Input : -3     Output : -3 is Odd Number
//  Input : -12    Output : -12 is Even Number
//
///////////////////////////////////////////////////////////////