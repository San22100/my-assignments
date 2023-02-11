public class Inheritance
{
    public static void main(String[] args) {


        Customer CustomerObj = new Customer(5, 120);

        CustomerObj.toPurchaseFood();
        System.out.println();

        CustomerObj.toConsumeFood();
        System.out.println();

        Seller SellerObj = new Seller(2, 120, 3);
        SellerObj.toSale();
        SellerObj.toConsumeFood();
        SellerObj.toPurchaseFood();
        System.out.println();


    }

    }
class Customer{
    int NumberOfItems;
    int AmountOfCalories;

    public Customer(int NumberOfItems, int AmountOfCalories) {
        this.NumberOfItems = NumberOfItems;
        this.AmountOfCalories = AmountOfCalories;
    }
        void toPurchaseFood(){
            System.out.println("A customer buy " + NumberOfItems + " item of food");
            System.out.println("------------------");
        }
        void toConsumeFood(){
            System.out.println("A customer consumes " + AmountOfCalories + "per serving of food");
            System.out.println("-------------------");
    }
}
class Seller extends Customer {
    int SaleOfFood;

    public Seller(int NumberOfItems, int AmountOfCalories, int SaleOfFood) {
        super(NumberOfItems, AmountOfCalories);
        this.SaleOfFood = SaleOfFood;
    }

    void toSale() {
        System.out.println("seller sells " + SaleOfFood + " item of food ");
        System.out.println("-----------------------");
    }
}


