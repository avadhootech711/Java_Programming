///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : PrintDigits
//  Input        : Integer
//  Output       : Void
//  Description  : This method prints each digit of the given
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void PrintDigits(int iNum)
    {
        int iDigit = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
    }
}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program19_4
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintDigits(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 1234     Output : 4 3 2 1
//  Input : 234      Output : 4 3 2
//  Input : 2571     Output : 1 7 5 2
//  Input : 1177     Output : 7 7 1 1
//  Input : 2101     Output : 1 0 1 2
//
///////////////////////////////////////////////////////////////

