//write a program to print all the EVEN numbers from 3 to 30
public class Even
{
    public static void main(String[] args)
    {
        int num = 30;
        int i =3;
        for (i=3;i<=num;i++)
        {
            if(i%2==0)
                System.out.println("the even number are " + i);
        }
    }
}
