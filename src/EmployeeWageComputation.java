import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class EmployeeWageComputation {
    public static final int IS_PRESENT=2;
    public static final int IS_PRESENT_PARTTIME=1;
    public static final int WAGE_PER_HOUR=20;

    public static void main(String[] args) {
        int emphours=0;
        int empwage=0;
        double totalempwage=0;

        for (int i=1;i<=20;i++)
        {
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
            totalempwage=totalempwage+empwage;

        }
        System.out.println("Employee Monthly wage =" + totalempwage);

    }
}
