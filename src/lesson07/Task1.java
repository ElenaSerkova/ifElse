package lesson07;
//Task 1 Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
public class Task1 {

        public static void main(String[] args) {

            int i = 1;
            do {
                if (i % 5 == 0)
                { System.out.println("Element: " + i);}
                i++;
            } while(i <= 100);

        }}



//if (i % 3 == 0)
//                continue;
//            if (i >= 17)
//                break;