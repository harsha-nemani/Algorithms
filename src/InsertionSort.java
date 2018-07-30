import java.util.Arrays;

public class InsertionSort {

    void insertSort(int[] arr){
        for(int j=1; j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 58};
        InsertionSort ins = new InsertionSort();
        ins.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
