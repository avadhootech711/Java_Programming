///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : DisplayGrade
//  Description  : This method displays the grade of a student
//                 based on the marks entered by the user.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void DisplayGrade(int iNum)
    {
        if(iNum < 0 || iNum > 100)
        {
            System.out.println("Invalid Marks");
            return;
        }

        if(iNum >= 75)
        {
            System.out.println("First Class with Distinction Grade : A");
            return;
        }

        else if(iNum >= 60)
        {
            System.out.println("First Class Grade : B");
            return;
        }

        else if(iNum >= 50)
        {
            System.out.println("Second Class Grade : C");
            return;
        }

        else if(iNum >= 35)
        {
            System.out.println("Pass Class Grade : D");
            return;
        }

        else
        {
            System.out.println("Fail Grade : F");
        }
    }
}

//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program19_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayGrade(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  85      Output : First Class with Distinction  Grade : A
//  Input :  72      Output : First Class                   Grade : B
//  Input :  55      Output : Second Class                  Grade : C
//  Input :  38      Output : Pass Class                    Grade : D
//  Input :  20      Output : Fail                          Grade : F
//  Input : -10      Output : Invalid Marks
//  Input :  120     Output : Invalid Marks
//
///////////////////////////////////////////////////////////////