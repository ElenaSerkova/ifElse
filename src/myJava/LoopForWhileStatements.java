package myJava;

public class LoopForWhileStatements {
    public static void main(String[] args) {
        for (int i = 5; i < 25; i += 2){
            if (i % 3 == 0)
                continue; // не учитывает строки
            if (i >= 17)
                break; // выходит из цикла
            System.out.println("Element: " + i);
        }
    }
}