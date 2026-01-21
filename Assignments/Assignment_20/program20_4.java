///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : FindLargestDigit
//  Description   : This method finds and prints the largest digit
//                  present in the given integer number.
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void FindLargestDigit(int iNum)
    {
        int iDigit = 0, iMax = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit > iMax)
            {
                iMax = iDigit;
            }

            iNum = iNum / 10;
        }
        System.out.println("Largest Digit : " + iMax);
    }
}

//  TIME COMPLEXITY : O(N) where N is number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program20_4
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindLargestDigit(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 751239      Output : Largest Digit : 9
//  Input : 4086        Output : Largest Digit : 8
//  Input : -9831       Output : Largest Digit : 9
//  Input : 5           Output : Largest Digit : 5
//  Input : 1234        Output : Largest Digit : 4
//
///////////////////////////////////////////////////////////////