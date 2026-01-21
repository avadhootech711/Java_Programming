///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : FindSmallestDigit
//  Description   : This method finds and prints the Smallest digit
//                  present in the given integer number.
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void FindSmallestDigit(int iNum)
    {
        int iDigit = 0, iMin = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        iMin = iNum % 10;

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit < iMin)
            {
                iMin = iDigit;
            }

            iNum = iNum / 10;
        }
        System.out.println("Smallest Digit : " + iMin);
    }
}

//  TIME COMPLEXITY : O(N) where N is number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program20_5
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindSmallestDigit(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 75249      Output : Smallest Digit : 2
//  Input  : 90861      Output : Smallest Digit : 0
//  Input  : 5          Output : Smallest Digit : 5
//  Input  : -4832      Output : Smallest Digit : 2
//  Input  : 1000       Output : Smallest Digit : 0
//
///////////////////////////////////////////////////////////////