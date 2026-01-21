///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CalculatePower
//  Description  : This method calculates power using loop
//  Input        : Integer, Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic 
{
    public void CalculatePower(int iBase, int iExp)
    {
        int iCnt = 0, iRet = 1;

        if(iExp < 0)        // Updating negative exponent to positive because it will lead to float value
        {
            iExp = -iExp;
        }

        for(iCnt = 1; iCnt <= iExp; iCnt++)
        {
            iRet = iRet * iBase;
        }

        System.out.println("Power is : " + iRet);

    }
}

// TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program19_5
{
    public static void main(String A[])
    {
        int iNumber = 0, iPower = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Base Number : ");
        iNumber = sobj.nextInt();

        System.out.println("Enter Exponent Number : ");
        iPower = sobj.nextInt();


        Logic lobj = new Logic();
        lobj.CalculatePower(iNumber , iPower);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : Base =  2  Exponent =  5      Output :  32
//  Input : Base =  5  Exponent =  0      Output :  1
//  Input : Base =  3  Exponent =  3      Output :  27
//  Input : Base =  7  Exponent = -2      Output :  49
//  Input : Base = -7  Exponent =  3      Output : -343
//
///////////////////////////////////////////////////////////////