package diyMethodPrac;

public class Main {
    //create method that makes price

    public static double findDiscountPrice(double price, double discount) {

        double disPrice = (1 - discount)*price;

        return disPrice;

    }
    //create discount
    //Return final price

    public static void main(String[] args) {
        System.out.println(findDiscountPrice(275,.25));
         //     1-Method with paramaters (price, discount)

         //       2-Calculate final price
         //      3-Return final price

    }

}


