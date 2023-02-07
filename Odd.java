// write a program to print all the odd numbers from 2 to 20
public class Odd
{
    public static void main(String[] args)
    {
        int num = 20;
        int i =2;
        for (i=2;i<=num;i++)
        {
            if(i%2==1)
                System.out.println("the odd number are " + i);
        }
    }
}
