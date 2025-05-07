package improvedbubblesort;

import java.util.Arrays;

public class ImprovedBubbleSort {

    public static void main(String[] args) {

        int[] numbers = {50, 10, 20, 5, 8,9,80,70,30,10,100};

        bubbleSort(numbers);

    }

    public static void bubbleSort(int[] list) {
//        boolean needNextPass = true;

        for (int k = 1; k < list.length; k++) {
            // Array may be sorted and next pass not needed
            // needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {

                // {50,10,20,5,8}
                if (list[i] > list[i + 1]) {
                    // Swap list[i] with list[i + 1]
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    //  needNextPass = true;// Next pass still needed
                }
            }
        }

        System.out.println(Arrays.toString(list));

    }

}
