package addHomework3;

public class ProductDemo {
    public static void main(String[] args) {
        Product prod1 = new Product("Phone");
        Product prod2 = new Product("Photo");
        Product prod3 = new Product("Video");

        double regularPrice1 = 320.79;
        double regularPrice2 = 748.89;
        double regularPrice3 = 1567.99;

        int discount1 = 30;
        int discount2 = 20;
        int discount3 = 50;

        double actualPrice1 = regularPrice1 * discount1 / 100;
        double actualPrice2 = regularPrice2 * discount2 / 100;
        double actualPrice3 = regularPrice3 * discount3 / 100;



        System.out.println("Regular price of " + prod1.name + " is " + regularPrice1 + " dollars. Actual price with discount " + discount1 + "% is " + actualPrice1 + " dollars!" );
        System.out.println("Regular price of " + prod2.name + " is " + regularPrice2 + " dollars. Actual price with discount " + discount2 + "% is " + actualPrice2 + " dollars!" );
        System.out.println("Regular price of " + prod3.name + " is " + regularPrice3 + " dollars. Actual price with discount " + discount3 + "% is " + actualPrice3 + " dollars!" );


    }

}
