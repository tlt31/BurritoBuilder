import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by tim on 4/28/15.
 */
public class BurritoOrderer {

    private static Burrito cheesy;
    private static Burrito extraHot;
    private static Burrito vegetarian;

    public static void main(String[] args)
    {

        cheesy = new Burrito("Cheesy", 8.50);
        extraHot = new Burrito("Extra Hot", 8.40);
        vegetarian = new Burrito("Vegetarian", 7.25);

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

        System.out.println("");
        System.out.println("Press the enter to return to the main menu");

        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(readString!=null) {
            mainMenu();
        }

        mainMenu();
    }

    public static void placeOrder()
    {
        Scanner scanner = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("PLACE AN ORDER");
        System.out.println();
        System.out.println("Please enter your name for the order:");
        String ordeName = scanner.nextLine();
        System.out.println("Please enter your phone number for the order:");
        String phoneNumber = scanner.nextLine();
        System.out.println("How many Cheesy Burritos would you like to order?: ");
        int nCheesy = scanner.nextInt();
        System.out.println("How many Extra Hot Burritos would you like to order?: ");
        int nExtraHot = scanner.nextInt();
        System.out.println("How many Vegetarian Burritos would you like to order?: ");
        int nVeg = scanner.nextInt();


        System.out.println("");
        System.out.println("Press the enter key to submit your order");


        String readString = scanner.nextLine();
        while(readString!=null) {
            System.out.println();
            System.out.println("ORDER DETAILS");
            System.out.println(ordeName);
            System.out.println(phoneNumber);
            System.out.println();
            double pCheesy = nCheesy*cheesy.getPrice();
            double pExtraHot = nExtraHot*extraHot.getPrice();
            double pVeg = nVeg*vegetarian.getPrice();
            System.out.println(nCheesy + " Cheesy Burritos " + nf.format(pCheesy));
            System.out.println(nExtraHot + " Extra Hot Burritos " + (nf.format(pExtraHot)));
            System.out.println(nVeg + " Vegetarian Burritos " + (nf.format(pVeg)));
            double orderTotal = pCheesy + pExtraHot + pVeg;
            double roundedNumber = Math.round(orderTotal);
            System.out.println("Total: " + (nf.format(roundedNumber)));
            System.out.println("");
            System.out.println("Press the enter to return to the main menu");
            String readString2 = scanner.nextLine();
            while(readString2!=null) {
                mainMenu();
            }
        }


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
