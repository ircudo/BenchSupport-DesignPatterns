package client;

import model.*;

import java.math.*;

public class Main {
    public static void main(String[] args) {
        testStrategy();
    }

    private static void testStrategy() {

        // create instance of Easter Discounter
        Discounter easterDiscounter = new EasterDiscounter();
        // create instance of Christmas Discounter
        Discounter christmasDiscounter = new ChristmasDiscounter();

        // calculate value of a product at Easter sale ($100 base value)
        BigDecimal discountedEasterprice = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));

        // calculate value of a product at Christmas sale
        BigDecimal discountedChristmasprice = christmasDiscounter.applyDiscount(BigDecimal.valueOf(100));

        // print out the discounted prices
        System.out.println(discountedEasterprice);
        System.out.println(discountedChristmasprice);

    }
}
