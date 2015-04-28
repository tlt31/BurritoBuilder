import java.math.BigDecimal;

/**
 * Created by tim on 4/28/15.
 */
public class BurritoBuilder {

    public static void main(String[] args)
    {
        System.out.println("Welcome to Katie's Burrito Barn!");
        System.out.println(" ");

        Burrito cheesyB = new Burrito("cheesyB", 8.50);

        System.out.println(cheesyB.getBurritoName());


    }

    static class Burrito{

        private String burritoName;
        private double burritoPrice;

        public Burrito(String name, double price)
        {
            burritoName = name;
            burritoPrice = price;
        }

        public String getBurritoName()
        {
            return burritoName;
        }

        public double getPrice()
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
