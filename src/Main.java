import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 58};
        InsertionSort ins = new InsertionSort();
        ins.insertSortDecreasingOrder(arr);
        System.out.println(Arrays.toString(arr));

        MergeSort mergesort = new MergeSort();
        mergesort.sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
