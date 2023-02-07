//make a calculator to find out simple interest and compound interest
public class Calculator
{
    public static void main(String[] args)
    {
        Calculation CalculateObj1 = new Calculation();
        Calculation CalculateObj2 = new Calculation();

        CalculateObj1.setValue(15000, 2.5,2,3);
        CalculateObj2.setValue(25000,5,1.5,5);


    }
}
class Calculation
{   double principal,rate,time,si,ci;
    int number;
    void setValue(double p, double r, double t ,int n)
    {
        principal = p;
        rate = r;
        time = t;
        number = n;
        calculate();
    }
    void calculate ()
    {
        si = (principal*time*rate)/100;
        ci =  principal* (Math.pow((1+ rate/100),(time*number))) - principal;

        printResult();
    }

        void printResult()
    {


        System.out.println("The Simple Interest is : " +si);
        System.out.println("The compound Interest is : " +ci);
        System.out.println("...........................");
    }
}

