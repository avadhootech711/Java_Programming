///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckDivisible
//  Description  : This method checks whether the number is
//                 divisible by both 5 and 11.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckDivisible(int iNum)
    {
        if(iNum % 5 == 0 && iNum % 11 == 0)
        {
            System.out.println(iNum + " is divisible by both 5 and 11");
        }
        else
        {
            System.out.println(iNum + " is not divisible by both 5 and 11");
        }
    }
}


//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program19_3
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckDivisible(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 55      Output : 55 is divisible by both 5 and 11
//  Input : 22      Output : 22 is not divisible by both 5 and 11
//  Input : 10      Output : 10 is not divisible by both 5 and 11
//  Input : 0       Output : 0 is divisible by both 5 and 11
//  Input : 110     Output : 110 is divisible by both 5 and 11
//
///////////////////////////////////////////////////////////////