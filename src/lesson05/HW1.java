package lesson05;

import java.util.Locale;

/* 1 Создайте строку через new - I study Basic Java!
   2 Напишите метод, который принимает в качестве параметра строку, передайте в этот метод строку, которую создали в п.1
   3 Распечатать последний символ строки. Используем метод String.charAt().
   4 Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
   5 Заменить все символы “а” на “о”.
   6 Преобразуйте строку к верхнему регистру.
   7 Преобразуйте строку к нижнему регистру.
   8 Вырезать строку Java c помощью метода String.substring().

 */
public class HW1 {
    public static void main(String[] args) {
        String text = "I study Basic Java!";
        System.out.println(text);

        System.out.println("======== длина строки ===========");
        System.out.println(text.length());

        System.out.println("======== 1 символ ===========");
        char sym = text.charAt(0);
        System.out.println(sym);

        System.out.println("========= последний символ ==========");
        System.out.println(text.charAt(18));

        System.out.println("======= проверка вхождения слова в текст ============");
        String testPiesOfText = "Java";
        boolean resultCheckContains = text.contains(testPiesOfText);
        System.out.println("Contains result is " + resultCheckContains);

        System.out.println("====== замена символов 'a' на 'o' =============");
        String replaseText = text.replace("a", "o");
        System.out.println(replaseText);

        System.out.println("====== верхний регистр =============");
        String textAfterUpperCase = text.toUpperCase();
        System.out.println(textAfterUpperCase);

        System.out.println("====== нижний регистр =============");
        String textAfterLowerCase = text.toLowerCase();
        System.out.println(textAfterLowerCase);

        System.out.println("====== вырезать кусок текста =============");
        String substring = text.substring(14, 18);
        System.out.println(substring);





    }
}
