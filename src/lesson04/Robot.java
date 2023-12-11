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

    public float Convertation(float usa){ //1 метод
        float usaToEuro = 0.85f;
        float euro = usa * usaToEuro;
        return euro;

    }

    public double currencyConverter(double usdValue, double exchangeRateUsdToEuro){ //2 метод
        double euroValue = usdValue * exchangeRateUsdToEuro;
        return euroValue;
    }

    public double currencyConverter(double usdValue){ //1 метод
      double exchangeRateUsdToEuro = 0.97;
      double euroValue = usdValue * exchangeRateUsdToEuro;
      return euroValue;
    }
}

