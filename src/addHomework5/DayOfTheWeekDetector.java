package addHomework5;

import java.util.Scanner;

public class DayOfTheWeekDetector {
    public int getDayNumberFromUser() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input day number between 1 and 7: ");
        return scan.nextInt();
    }
}
