package lesson05;

public class String04 {
    public static void main(String[] args) {

        String text = "Это текст для проверки работы методов типа String";

        System.out.println(text);
        System.out.println(" ====== проверка вхождения текста в другую строку  =====");

        String testString1 = "рабо";

        boolean resultCheckContains = text.contains(testString1);

        System.out.println("Contains result is - " + resultCheckContains);

        System.out.println("Contains word 'str' result is - " + text.contains("str"));

        System.out.println("====== верхний регистр =============");

        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        System.out.println("====== нижний регистр =============");

        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);

        System.out.println("Contains word 'str' result is - " + textAfterLowerCase.contains("str"));


    }

}
