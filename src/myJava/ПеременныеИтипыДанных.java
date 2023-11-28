package myJava;

public class ПеременныеИтипыДанных {
    public static void main(String[] args) {
        System.out.println("Переменные и типы данных");

        int age; //переменная
        age = 40; //значение переменной
        age = 13;
 // или можно сразу так: int age = 40;
 // если значений age несколько, то выводится только последнее значение.
 // переменная int пишется один раз, потом только значение
 // int age = 40;
 // age = 5;
 // age = 13;
        System.out.println(age);

        age = 24;
        System.out.println("Возраст " + age + ".");
        age = 45;
        System.out.println(age);

// Переменные для вывода типов данных

// Целые числа
        byte kg = 47;
        short num1 = 128;
        int num2 = 78;
        long num3 = 68935797;
// byte -128 + 127 => 1 байт
// short -32768 + 327667 => 2 байтa
// int -2147483648 + 2147483647 => 4 байтa
// long -9 223 372 036 854 775 808 + 9 223 372 036 854 775 807 => 8 байтa
        System.out.println("Мой вес: " + kg + " kg");

// Числа с плаваюшей точкой
        float num4 = 6.80978f;
        double num5 = 7.698779d;
// float = 4,36748f => обязательно добавлять f
// double 5,65738d => в два раза больше, чем float. d в конце опционально.
        System.out.println(num5);

// Одиночный символ
        char letter = 'E';
        char ch = '&';
        System.out.println(ch);

// Набор из символов, строки
        String name = "Elena Serkova";
        System.out.println(name);

//True or False
        boolean elenaIsHappy = true; //or fasle

    }
}
