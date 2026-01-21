///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : findFactorial
//  Description  : This method calculates the factorial of the
//                 given number prints the result.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void findFactorial(int iNum)
    {
        int iCnt = 0, iFact = 1;

        if(iNum < 0)
        {
            iNum = -iNum;           // Factorial is not defined for negative numbers.
        }

        for(iCnt = 1; iCnt <= iNum; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        System.out.println("Factorial of " + iNum + " is : " + iFact);
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program16_3
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.findFactorial(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  5     Output : Factorial of 5 is  :  120
//  Input :  0     Output : Factorial of 0 is  :  1
//  Input :  1     Output : Factorial of 1 is  :  1
//  Input : -3     Output : Factorial of -3 is : 6
//  Input :  6     Output : Factorial of 6 is  :  720
//
///////////////////////////////////////////////////////////////