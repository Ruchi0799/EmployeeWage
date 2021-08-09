public class EmployeeWageComputation {
    public static final int IS_PRESENT=1;

    public static void main(String[] args) {
        double empcheck=Math.floor(Math.random()*10)%2;
        if(empcheck==IS_PRESENT)
        {
            System.out.println("The Employee is Present");
        }
        else
        {
            System.out.println("The Employee is Absent");
        }
    }
}
