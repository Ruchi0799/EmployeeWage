public class EmployeeWageComputation {
    public static final int IS_PRESENT=1;
    public static final int WAGE_PER_HOUR=20;

    public static void main(String[] args) {
        int emphours=0;
        int empwage=0;
        double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==IS_PRESENT)
        {
            emphours=8;
        }
        empwage=WAGE_PER_HOUR*emphours;
        System.out.println("Employee Daily wage =" + empwage);
    }
}
