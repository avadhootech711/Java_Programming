///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : PrintReverse
//  Description  : This method prints numbers from N to 1 in 
//                 reverse order.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void PrintReverse(int iNum)
    {
        int iCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = iNum ; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program20_2
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintReverse(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}


///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  5       Output : 5 4 3 2 1
//  Input :  10      Output : 10 9 8 7 6 5 4 3 2 1
//  Input : -4       Output : 4 3 2 1
//  Input :  13      Output : 13 12 11 10 9 8 7 6 5 4 3 2 1
//  Input :  11      Output : 11 10 9 8 7 6 5 4 3 2 1
//
///////////////////////////////////////////////////////////////