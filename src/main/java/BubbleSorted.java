import java.util.Arrays;

public class BubbleSorted {
    public static void main(String[] args) {

        int[] array = {10, 6, 5, 87, 34, 90, 15};
        boolean isSorted = false;
        int temp;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }


}

