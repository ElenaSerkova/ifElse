package lesson11;

import java.util.Arrays;


    public class ArraySort {

        public void bubbleSort(int[] workingArray){
            boolean notSorted = true;
            int temp;

            // {1,2,3,4,5,6,7,8} - если мы меняем хотя бы одну пару -
            // то это означает что наш массив все еще не отсортирован

            while (notSorted) {
                System.out.println(notSorted);
                System.out.println(Arrays.toString(workingArray));
                notSorted = false;
                for (int i = 0; i < workingArray.length - 1; i++) {
                    if (workingArray[i] > workingArray[i + 1]) {
                        temp = workingArray[i];
                        workingArray[i] = workingArray[i + 1];
                        workingArray[i + 1] = temp;
                        notSorted = true;
                        //System.out.println(Arrays.toString(workingArray));
                    }
                }
            }

        }}

