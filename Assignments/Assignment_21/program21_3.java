///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : DisplayFactors
//  Description   : Used to display all factors of a given number
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void DisplayFactors(int iNum)
    {
        int iCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 1; iCnt <= iNum/2; iCnt++)
        {
            if(iNum % iCnt == 0)
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

class program21_3
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayFactors(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10      Output : 1 2 5
//  Input : 7       Output : 1 
//  Input : 18      Output : 1 2 3 6 9
//  Input : 11      Output : 1
//  Input : -12     Output : 1 2 3 4 6
//
///////////////////////////////////////////////////////////////