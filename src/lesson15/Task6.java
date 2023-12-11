package lesson15;
//Создайте массив из 8 случайных целых чисел из отрезка [1;10]
//   Выведите массив на экран в строку
//   Замените каждый элемент с нечётным индексом на ноль
//   Снова выведете массив на экран на отдельной строке
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();

        int arraySize = 8;
        int[] intArray = new int[arraySize];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(1, 10);
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0){
                intArray[i] = 0;
            }

        } System.out.println(Arrays.toString(intArray));
}}
