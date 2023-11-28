package myJava;

public class LoopDoWhile {
    public static void main(String[] args) {

    int i = 1;
        do {
        System.out.println("Element: " + i);
        i++;
    } while(i <= 10);
}}

// отличие в том, что код 100% выполняется хотя бы 1 раз, то есть сначала выполняется код, потом проверяются заданные условия

//      int i = 100;
//      do {
//          System.out.println("Element: " + i);
//          i *= 100;
//      } while (i < 10);
//      }
// !!!условия выше прописаны намеренно не верно и код не должен сработать, однако он сработает не корректно!!!
