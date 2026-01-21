///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CheckPrime
//  Description  : This method checks whether the given number
//                 is prime or not and prints the result.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CheckPrime(int iNum)
    {
        int iCnt = 0, iCount = 0;

        if(iNum <= 1)
        {
            System.out.println("Not a prime number");
            return;
        }

        for(iCnt = 2; iCnt <= (iNum / 2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                iCount++;
                break;
            }
        }

        if(iCount == 0)
        {
            System.out.println("Is a prime number");
        }
        else
        {
            System.out.println("Is not a prime number");
        }
    }
}

 //  TIME COMPLEXITY : O(N/2)

///////////////////////////////////////////////////////////////
//
//  Entry Point Class of Application
//
///////////////////////////////////////////////////////////////

class program18_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPrime(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 7       Output : Is a prime number
//  Input : 10      Output : Is not a prime number
//  Input : 1       Output : Not a prime number
//  Input : -5      Output : Not a prime number
//  Input : 2       Output : Is a prime number
//
///////////////////////////////////////////////////////////////