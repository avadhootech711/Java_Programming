///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : CheckPerfect
//  Description   : Function checks whether number is perfect.
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPerfect(int iNum)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNum/2; iCnt++)
        {
            if (iNum % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        
        if(iSum == iNum)
        {
            System.out.println("It is a perfect number");
        }
        else
        {
            System.out.println("It is NOT a perfect number");
        }
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program20_3
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPerfect(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 6       Output : It is a Perfect Number
//  Input : 28      Output : It is a Perfect Number
//  Input : 12      Output : It is NOT a Perfect Number
//  Input : 15      Output : It is NOT a Perfect Number
//  Input : 496     Output : It is a Perfect Number
//
///////////////////////////////////////////////////////////////
