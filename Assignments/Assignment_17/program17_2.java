///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckPalindrome
//  Description  : This method checks whether a given number is a
//                 palindrome or not by reversing it and comparing it
//                 with the original number.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPalindrome(int iNum)
    {
        int iDigit = 0, iRev = 0, iTemp = iNum;

        if(iNum < 0)
        {
            iNum = -iNum;
            iTemp = iNum;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iRev = (iRev * 10) + iDigit;
            iNum = iNum / 10;
        }

        if(iTemp == iRev)
        {
            System.out.println(iTemp + " is a Palindrome");
        }
        else
        {
            System.out.println(iTemp + " is not a Palindrome");
        }
    }
}

//  TIME COMPLEXITY : O(N), where N is the number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program17_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPalindrome(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 121     Output : 121 is a Palindrome
//  Input : 123     Output : 123 is not a Palindrome
//  Input : -454    Output : 454 is a Palindrome
//  Input : 1001    Output : 1001 is a Palindrome
//  Input : 10      Output : 10 is not a Palindrome
//
///////////////////////////////////////////////////////////////