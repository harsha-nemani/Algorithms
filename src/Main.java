import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 58, 23};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
