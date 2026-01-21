///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : CountEvenOdd
//  Description   : This method counts how many even and odd 
//                  numbers are present in the range 1 to N.
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CountEvenOddRange(int iNum)
    {
        int iCnt = 0, iEvenCnt = 0, iOddCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEvenCnt++;
            }
            else
            {
                iOddCnt++;
            }
        }

        System.out.println("Count of Even Numbers : " + iEvenCnt);
        System.out.println("Count of Odd Numbers  : " + iOddCnt);
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program21_2
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CountEvenOddRange(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 10         Output : Even = 5, Odd = 5
//  Input  : 7          Output : Even = 3, Odd = 4
//  Input  : -8         Output : Even = 4, Odd = 4
//  Input  : 1          Output : Even = 0, Odd = 1
//  Input  : 0          Output : Even = 0, Odd = 0
//
///////////////////////////////////////////////////////////////
