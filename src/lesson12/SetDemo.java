package lesson12;

import java.util.Arrays;
import java.util.Scanner;

public class SetDemo {
    public static void main(String[] args) {
        Set[] sets = new Set[3];

        sets[0] = new Set("Drill", "Screwdriver");
        sets[1]= new Set("Pliers", "Hammer");
        sets[2] = new Set("Drill", "Hammer");

        for (int i = 0; i < sets.length; i++) {


        }

    //    System.out.println(Arrays.toString(sets));

   //     sets[0].tool1 = "Hammer";
  //      System.out.println(Arrays.toString(sets));
        Scanner scan = new Scanner(System.in);
        System.out.println("We have three sets of tools: ");
        System.out.println("Set 1. Consists of: " + sets[0].tool1 + ", " + sets[0].tool2);
        System.out.println("Set 2. Consists of: " + sets[1].tool1 + ", " + sets[1].tool2);
        System.out.println("Set 3. Consists of: " + sets[2].tool1 + ", " + sets[2].tool2);





    }


}
