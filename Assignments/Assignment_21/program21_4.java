///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : CountFactors
//  Description   : Used to count all factors of a given number
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CountFactors(int iNum)
    {
        int iCnt = 0, iCount = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= iNum/2; iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iCount++;
            }
        }
        System.out.println(iCount);
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program21_4
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CountFactors(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : Total Factors : 4
//  Input : 7       Output : Total Factors : 1
//  Input : 18      Output : Total Factors : 5
//  Input : 11      Output : Total Factors : 1
//  Input : -12     Output : Total Factors : 5
//
///////////////////////////////////////////////////////////////