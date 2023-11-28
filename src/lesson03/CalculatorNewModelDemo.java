package lesson03;

public class CalculatorNewModelDemo {

    public static void main(String[] args) {

        CalculatorNewModel calc = new CalculatorNewModel();

        int result = calc.sum(10,5);

        System.out.println("Результат сложения = " + result);

        result = calc.sub(16, 4);

        System.out.println("Результат вычитания = " + result);

        result = calc.multipl(34, 7);

        System.out.println("Результат умножения = " + result);

        result = (int) calc.div(25,5);

        System.out.println("Результат деления = " + result);

        double resultDiv = calc.div(10, 3);

        System.out.println("Результат деления = " + resultDiv);


    }
}
