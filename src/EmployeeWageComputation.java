

public class EmployeeWageComputation {
    public static final int IS_PRESENT = 2;
    public static final int IS_PRESENT_PARTTIME = 1;
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_DAYS = 20;
    public static final int MAX_HOURS = 100;

    public static void main(String[] args) {
        int emphours = 0;
        int empwage = 0;
        //double totalempwage = 0;
        int totalhours = 0;
        int totalworkingday=0;

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

        System.out.println("Employee Monthly wage =" + empwage);
    }
}