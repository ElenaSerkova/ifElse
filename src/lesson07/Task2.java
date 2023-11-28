package lesson07;

//Task 2 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
public class Task2 {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 100){
            if (i % 5 == 0)
            {
                if (i > 35)
                    break;
                System.out.println("Element: " + i);}
            i++;
        }

    }
}
