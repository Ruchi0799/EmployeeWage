import java.util.Scanner;

class EmployeeWageCalculate
{

    public static final int IS_PRESENT = 2;
    public static final int IS_PRESENT_PARTTIME = 1;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_DAYS = 20;
    public static final int MAX_HOURS = 100;

    public static void WageCalculation(String Company,double emphours,double empwage)
    {

        double totalhours = 0;
        double totalworkingday=0;

        while (totalhours <= MAX_HOURS || totalworkingday<=MAX_DAYS)
        {
            totalworkingday++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            if (empcheck == IS_PRESENT)
            {
                emphours = 8;
            }
            else if (empcheck == IS_PRESENT_PARTTIME)
            {
                emphours = 4;
            }
            else
            {
                emphours = 0;
            }
            totalhours = totalhours + emphours;


        }
        empwage = WAGE_PER_HOUR * totalhours;

        System.out.println("Employee Monthly wage for company "  +Company+ " is " +empwage);
    }
}

public class EmployeeWageUsingClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //double Hours= sc.nextDouble();
        //double Wage= sc.nextDouble();
        //double DailyWage1,DailyWage2;

        EmployeeWageCalculate Employee1=new EmployeeWageCalculate();
        Employee1.WageCalculation("Dmart",8,20);
        EmployeeWageCalculate Employee2=new EmployeeWageCalculate();
        Employee2.WageCalculation("Reliance",9,25);
        //System.out.println("The Daily Wage is:" +DailyWage1);
        //System.out.println("The Daily Wage is:" +DailyWage1);
    }
}
