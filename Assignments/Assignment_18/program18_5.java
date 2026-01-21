///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckSign
//  Description  : This method checks whether the given number
//                 is positive, negative, or zero and prints the result.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckSign(int iNum)
    {
        if(iNum > 0)
        {
            System.out.println(iNum + " is a Positive number");
        }

        if(iNum < 0)
        {
            System.out.println(iNum + " is a Negative number");
        }

        if(iNum == 0)
        {
            System.out.println("The number is Zero");
        }
    }
}

// TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
//////////////////////////////////////////////////////////////

class program18_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckSign(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  25      Output : 25 is a Positive number
//  Input : -15      Output : -15 is a Negative number
//  Input :  0       Output : The number is Zero
//  Input :  11      Output : 25 is a Positive number
//  Input : -21      Output : -15 is a Negative number
//
///////////////////////////////////////////////////////////////