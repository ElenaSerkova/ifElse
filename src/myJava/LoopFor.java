package myJava;

public class LoopFor  { //for сокрацение fori

    //циклы, это количество выполняемых операций

    public static void main(String[] args) {
//i=0 первое условие, i<=10 до какого момента будет проходить цикл, i++ как изменяется значение
 //       for (int i = 0; i <= 10; i++) {
 //           System.out.println("Element: " + i);
  //      }

  //      for (double i = 10; i > 0; i = i / 2) { //i /= 2 короткая запись
  //          System.out.println("Element: " + i);
  //      }
        for (float i = 100; i >= 10; i -= 2) { //i = i - 2
            System.out.println("Element: " + i);
        }
    }}
