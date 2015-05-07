import java.util.Scanner;

/**
 * Created by tim on 4/28/15.
 */
public class BurritoOrderer {

    private static Burrito cheesy;
    private static Burrito extraHot;
    private static Burrito vegetarian;
    private static Burrito dessert;
    private static Burrito sPork;

    public static void main(String[] args)
    {

        cheesy = new Burrito("Cheesy", 8.50);
        extraHot = new Burrito("Extra Hot", 8.40);
        vegetarian = new Burrito("Vegetarian", 8.40);
        dessert = new Burrito("Dessert", 8.40);
        sPork = new Burrito("Shredded Pork", 8.40);

        System.out.println(" ");
        System.out.println("Welcome to Katie's Burrito Barn!");
        System.out.println(" ");

        mainMenu();
        System.out.println();

    }

    public static void mainMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1: See Menu");
        System.out.println("2: Place Order");
        System.out.println("3: Exit");
        System.out.print("(1-3):");

        Scanner nScan = new Scanner(System.in);
        int selection = nScan.nextInt();

        switch (selection) {
            case 1:
                showMenu();
                break;
            case 2:
                placeOrder();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("You have not entered a valid option.  Please try again.");
                mainMenu();
        }
    }

    public static void showMenu()
    {
        
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("NAME       PRICE");
        System.out.println(cheesy.getBurritoName() + "      " + cheesy.getPrice());
        System.out.println(extraHot.getBurritoName() + "      " + extraHot.getPrice());
        System.out.println(vegetarian.getBurritoName() + "      " + vegetarian.getPrice());
        System.out.println(dessert.getBurritoName() + "       " + dessert.getPrice());
        System.out.println(sPork.getBurritoName() + "        " + sPork.getPrice());

        System.out.println("");
        System.out.println("Press any key to return to the main menu");

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            mainMenu();
        }

        mainMenu();
    }

    public static void placeOrder()
    {
        System.out.println();
    }

    private static class Burrito{

        private String burritoName;
        private double burritoPrice;
        public Burrito extraHot;

        public Burrito(String name, double price)
        {
            burritoName = name;
            burritoPrice = price;
        }

        public String getBurritoName()
        {
            return burritoName;
        }

        double getPrice()
        {
            return burritoPrice;
        }

        public void setName(String name)
        {
            burritoName = name;
        }

        public void setPrice(double price)
        {
            burritoPrice = price;
        }
    }
}
