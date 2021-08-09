import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class EmployeeWageComputation {
    public static final int IS_PRESENT=2;
    public static final int IS_PRESENT_PARTTIME=1;
    public static final int WAGE_PER_HOUR=20;

    public static void main(String[] args) {
        int emphours=0;
        int empwage=0;
        double empcheck=Math.floor(Math.random()*10)%3;
        switch ((int) empcheck)
        {
            case 0:
                System.out.println("The Employee is Absent");
                break;

            case 1:
                emphours=4;
                empwage=WAGE_PER_HOUR*emphours;
                System.out.println("Employee Daily wage =" + empwage);
                break;

            case 2:
                emphours=8;
                empwage=WAGE_PER_HOUR*emphours;
                System.out.println("Employee Daily wage =" + empwage);
                break;
        }

    }
}
