///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : FindMax
//  Description  : This method accepts two integers and prints the
//                 maximum of the two numbers.
//  Input        : Integer, Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 == iNo2)
        {
            System.out.println("Both numbers are equal.");
        }
        else if(iNo1 > iNo2)
        {
            System.out.println("Maximum number is: " + iNo1);
        }
        else
        {
            System.out.println("Maximum number is: " + iNo2);
        }
    }
}

//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program17_3
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Value1 : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Value2 : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindMax(iValue1, iValue2);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10 20      Output : Maximum number is : 20
//  Input : -5 3       Output : Maximum number is : 3
//  Input : 100 100    Output : Both numbers are equal
//  Input : 7 -12      Output : Maximum number is : 7
//  Input : 11 21      Output : Maximum number is : 21
//
///////////////////////////////////////////////////////////////