public class HomeWork {
    public static void main(String[] args) {
        Chair chair = new Chair();
        Table table = new Table();
        Bed bed = new Bed();


        chair.toSit();
        table.toEat();
        table.toPut();
        bed.toPut();
        bed.toSit();
        bed.toEat();
    }
}

interface sitting {
    void toSit();
}
interface putting {
    void toPut();
}
interface eating{
    void toEat();
}
class Furniture implements sitting
{

    @Override
    public void toSit() {
        System.out.println("furniture can be used to make sitting objects");
    }
}
class Chair implements sitting{

    @Override
    public void toSit() {
        System.out.println("chair can be used for sitting");
    }
}
class Table extends Furniture implements eating,putting {

    @Override
    public void toPut() {
        System.out.println("we can put any stuff on the table ");
    }

    @Override
    public void toEat() {
        System.out.println("we can eat our food on the table");
    }
}
    class Bed extends Furniture implements sitting,putting,eating{

        @Override
        public void toPut() {
            System.out.println("we can put bedsheets in bed");
        }

        @Override
        public void toEat() {
            System.out.println("we can eat some snacks in bed if we want lol");
        }
    }





