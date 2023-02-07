//find out the highest value out of these number
//a = 5, b = 4 and c = 8
public class Assignments
{
    public static void main(String[] args)
    {
        Number NumberObj1 = new Number();
        NumberObj1.analyze();

    }
}
class Number{
    int a = 5;
    int b = 4;
    int c = 8;

    void analyze()
    {
    if
            (c >= a && c>=b)
    {
            System.out.println(c + " is the highest number");
    }
        else if (b>=a && b>=c)
        {
            System.out.println(b + " is the highest number");
        }
        else{
                System.out.println(a + " is the highest number");
        }

}

}
