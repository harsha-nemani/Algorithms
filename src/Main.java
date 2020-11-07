import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 58, 23};
        float[] floatArr = {(float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.51};

        ShellSort shellSort = new ShellSort();
        shellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
