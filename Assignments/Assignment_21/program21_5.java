///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : PrintDivisibleBy2and3
//  Description   : Prints all numbers from 1 to N divisible by both 2 and 3
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void PrintDivisibleBy2and3(int iNum)
    {
        int iCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if((iCnt % 2 == 0) && (iCnt % 3 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////


class program21_5
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintDivisibleBy2and3(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  20      Output : 6 12 18
//  Input :  30      Output : 6 12 18 24 30
//  Input :  10      Output : 6
//  Input :  21      Output : 6 12 18
//  Input : -21      Output : 6 12 18
//
///////////////////////////////////////////////////////////////