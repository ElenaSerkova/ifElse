package lesson03;

import java.util.concurrent.Callable;

public class Calculator1Demo {

    public static void main(String[] args) {

        Calculator1 calc = new Calculator1();

        calc.x = 6;
        calc.y = 17;

        calc.printSum();

        Calculator1 calc2 = new Calculator1();

        calc2.x = 95;
        calc2.y = 84;

        calc2.printSum();

        Calculator1 calc3 = new Calculator1();

        calc3.x = 456;
        calc3.y = 467;

        calc3.printSum();

        Calculator1 calc4 = new Calculator1();

        calc4.x = 6789;
        calc4.y = 7889;

        calc4.printSum();

        Calculator1 calc5 = new Calculator1();

        calc5.x = 79999;
        calc5.y = 79084;

        calc5.printSum();



    }
}
