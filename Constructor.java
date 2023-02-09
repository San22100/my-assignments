public class Constructor {
    public static void main(String[] args) {

        Printer printerObj1 = new Printer();
        printerObj1.print(5);
        byte nop = 5;
        printerObj1.print(nop,2);
        printerObj1.print("Javafile");

    }
}
class Printer
{
    void print(String documentName) {
        System.out.println("the document name is : " +documentName);
    }

    void print(int numberOfPages ) {
        System.out.println("print(int) : number of pages to print is : "+ numberOfPages);
    }

    void print(byte numberOfPages, int time) {
        System.out.println(" number of page to print is :" + numberOfPages + "in :"+ time + "  a day");
    }
}
