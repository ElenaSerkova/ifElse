package myJava;

//условная конструкция if-else
public class ifElso {
    public static void main(String[] args) {
    int x = 10, y = 5; //if (x == y) <, >, ==, <=, >=, !=
    char sym1 ='A', sym2 = 'A';
    boolean isHasCar = true; //if (isHasCar == false) or if (isHasCar)

    if (x == y && isHasCar) {
        System.out.println("test1");
    } else if (x > y && isHasCar || sym1 != sym2){
        System.out.println("test2");
    } else if (x > y || sym1 != sym2){
        System.out.println("test2 true");
    } else {
        System.out.println("test3");
    }}}


