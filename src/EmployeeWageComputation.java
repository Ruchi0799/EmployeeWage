public class EmployeeWageComputation {
    public static final int IS_PRESENT=2;
    public static final int IS_PRESENT_PARTTIME=1;
    public static final int WAGE_PER_HOUR=20;

    public static void main(String[] args) {
        int emphours=0;
        int empwage=0;
        double empcheck=Math.floor(Math.random()*10)%3;
        if(empcheck==IS_PRESENT)
        {
            emphours=8;
        }
        else if (empcheck==IS_PRESENT_PARTTIME)
        {
            emphours=4;
        }
        else
        {
            emphours=0;
        }
        empwage=WAGE_PER_HOUR*emphours;
        System.out.println("Employee Daily wage =" + empwage);
    }
}
