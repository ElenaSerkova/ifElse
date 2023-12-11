package lesson03;

public class Task2 {

    public int num1;
    public int num2;
    public int num3;
    public int num4;
    public int num5;
    public int num6;
    public int num7;
    public int num8;
    public int num9;
    public  int num10;

    public Task2(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8, int num9, int num10) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
        this.num6 = num6;
        this.num7 = num7;
        this.num8 = num8;
        this.num9 = num9;
        this.num10 = num10;
    }

    public void printSum(){
        int result = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        System.out.println("Сумма значений = " + result) ;
        System.out.println("Среднее арифметическое = " + result / 10);

    }


}
