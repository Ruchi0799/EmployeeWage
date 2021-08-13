import java.util.Scanner;

public class EmployeeWageUsingMethod {

    public static double WageCalculation(double Hours,double Wage)
    {
        double TotalWage=Hours*Wage;
        return TotalWage;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        double Hours= sc.nextDouble();
        double Wage= sc.nextDouble();
        double DailyWage=WageCalculation(Hours,Wage);
        System.out.println("The Daily Wage is:" +DailyWage);


    }
}
