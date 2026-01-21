///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : PrintEvenNumbers
//  Description  : This method prints all even numbers from 1
//                 up to the given number.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void PrintEvenNumbers(int iNum)
    {
        int iCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 2; iCnt <= iNum; iCnt += 2)
        {
            System.out.println(iCnt);
        }
    }
}

//  TIME COMPLEXITY : O(N/2)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program18_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10       Output : 2 4 6 8 10
//  Input : -8       Output : 2 4 6 8
//  Input : 5        Output : 2 4
//  Input : 7        Output : 2 4 6
//  Input : 2        Output : 2
//
///////////////////////////////////////////////////////////////