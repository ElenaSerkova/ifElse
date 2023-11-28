package lesson05;

public class String05 {
        public static void main(String[] args) {

            String text = "  Это текст для проверки работы методов типа String  ";

            System.out.println(text);

            System.out.println(" ====== убрать пробелы с начала и конца текста   =====");

            text = text.trim();
            System.out.println(text);

            System.out.println(" ====== индекс с которого начинается кусок текста или буква   =====");

            System.out.println(text.indexOf("метод")); //если вхождния нет, система выдант -1

            System.out.println(" ====== замена буквы  =====");

            String replaceText = text.replaceAll("о","а");

            System.out.println(replaceText);
        }}

