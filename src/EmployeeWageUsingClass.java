import java.util.Scanner;

class EmployeeWageCalculate
{
    public static double WageCalculation(double Hours,double Wage)
    {
        double TotalWage=Hours*Wage;
        return TotalWage;
    }
}

public class EmployeeWageUsingClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double Hours= sc.nextDouble();
        double Wage= sc.nextDouble();
        double DailyWage;
        EmployeeWageCalculate Employee1=new EmployeeWageCalculate();
        DailyWage = Employee1.WageCalculation(Hours,Wage);
        System.out.println("The Daily Wage is:" +DailyWage);

    }
}
