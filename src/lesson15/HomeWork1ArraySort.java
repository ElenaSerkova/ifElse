package lesson15;

public class HomeWork1ArraySort {

    public void bubbleSort(HomeWork1[] workingArray) {
        boolean notSorted = true;
        HomeWork1 temp;

        while (notSorted) {

            notSorted = false;
            for (int i = 0; i < workingArray.length - 1; i++) {
                String currentHomeWork1Name = workingArray[i].getName();
                String nextHomeWork1Name = workingArray[i + 1].getName();

                if (currentHomeWork1Name.compareTo(nextHomeWork1Name) > 0) {
                    temp = workingArray[i];
                    workingArray[i] = workingArray[i + 1];
                    workingArray[i + 1] = temp;
                    notSorted = true;

                }
            }
        }
    }}
