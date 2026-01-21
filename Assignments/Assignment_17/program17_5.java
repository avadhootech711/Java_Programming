///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : PrintTable
//  Description  : This method prints the multiplication table
//                 of the given number up to 10.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void PrintTable(int iNum)
    {
        int iCnt = 0, iMult = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iMult = iCnt * iNum;
            System.out.println(iMult);
        }

    }
}

//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program17_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintTable(iValue);
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 5        Output : 5 10 15 20 25 30 35 40 45 50
//  Input : -3       Output : 3 6 9 12 15 18 21 24 27 30
//  Input : 0        Output : 0 0 0 0 0 0 0 0 0 0
//  Input : 11       Output : 11 22 33 44 55 66 77 88 99 110
//
///////////////////////////////////////////////////////////////