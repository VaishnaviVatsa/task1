/*
CodSoft task2
Vaishnavi Vatsa
*/

import java.util.*;
class StudentGradeCalculator
{
    float EnglishMarks,MathsMarks,HindiMarks,SanskritMarks,ScienceMarks;
    float Total,AvgPercentage;
    Scanner sc=new Scanner(System.in);
    void Welcome()
    {
        System.out.println("           STUDENT GRADE CALCULATOR         ");
        System.out.println("---------------------------------------------");
    }

    void insertMarks()
    {
        System.out.println("Enter the Marks:");

        System.out.println("English: ");
        EnglishMarks = sc.nextFloat();

        System.out.println("Maths: ");
        MathsMarks = sc.nextFloat();

        System.out.println("Hindi: ");
        HindiMarks = sc.nextFloat();

        System.out.println("Sanskrit: ");
        SanskritMarks = sc.nextFloat();

        System.out.println("Science: ");
        ScienceMarks = sc.nextFloat();
    }

    void gradeCalculator()
    {
        Total = EnglishMarks+MathsMarks+HindiMarks+SanskritMarks+ScienceMarks;
        AvgPercentage = Total/5;
    }

    void displayResult()
    {
        System.out.println("\n * * * RESULT * * *");
        System.out.println("----------------------");
        System.out.println("Subjects     ->    Marks");
        System.out.println("English           "+EnglishMarks);
        System.out.println("Maths             "+MathsMarks);
        System.out.println("Hindi             "+HindiMarks);
        System.out.println("Sanskrit          "+SanskritMarks);
        System.out.println("Science           "+ScienceMarks);

        System.out.println("\nTotal: "+Total);
        System.out.println("Average Percentage: "+AvgPercentage);
    }

    void grade()
    {
        if(AvgPercentage>33 && AvgPercentage<50)
        {
            System.out.println("Grade D");
            System.out.println("Your Performance is very Poor");
        }

        else if(AvgPercentage>50 && AvgPercentage<70)
        {
            System.out.println("Grade c");
            System.out.println("Your Performance is Average");
        }

        else if(AvgPercentage>70 && AvgPercentage<80)
        {
            System.out.println("Grade B");
            System.out.println("Your Performance is Good");
        }

        else if(AvgPercentage>80 && AvgPercentage<90)
        {
            System.out.println("Grade A");
            System.out.println("Your Performance is Excellent");
        }

        else if(AvgPercentage>90 && AvgPercentage<100)
        {
            System.out.println("Grade O");
            System.out.println("Your Performance is Outstanding");
        }

        else
        {
            System.out.println("You fail in Exam");
        }

        System.out.println("-----THANK YOU-----");
    }
}


public class Task02
{
    public static void main(String args[]) {
        StudentGradeCalculator sgc = new StudentGradeCalculator();
        sgc.Welcome();
        sgc.insertMarks();
        sgc.gradeCalculator();
        sgc.displayResult();
        sgc.grade();
    }
}