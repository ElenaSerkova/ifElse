package lesson04;

public class Robot {

    String mark;

    public Robot(String mark) {
        this.mark = mark;
    }

    public void hello(){

        System.out.println("Hello!");
        System.out.println("I am Robot " + mark);
    }

    public double currencyConverter(double usdValue){
      double exchangeRateUsdToEuro = 0.97;
      double euroValue = usdValue * exchangeRateUsdToEuro;
      return euroValue;
    }
}

