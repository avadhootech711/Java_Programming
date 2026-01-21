///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckLeapYear
//  Description  : This method checks whether the given year
//                 is a leap year or not and prints the result.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckLeapYear(int iYear)
    {
        if(iYear % 400 == 0 || (iYear % 4 == 0 && iYear % 100 != 0))
        {
            System.out.println(iYear + " is a Leap Year");
        }
        else
        {
            System.out.println(iYear + " is not a Leap Year");
        }

    }
}

// TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program19_1
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckLeapYear(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 2000        Output : 2000 is a Leap Year
//  Input : 1900        Output : 1900 is not a Leap Year
//  Input : 2024        Output : 2024 is a Leap Year
//  Input : 2023        Output : 2023 is not a Leap Year
//  Input : 3045        Output : 3045 is not a Leap Year
//
///////////////////////////////////////////////////////////////