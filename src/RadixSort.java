import java.util.Arrays;

public class RadixSort {

    /*
     * Worst Case = O(d(n+k))
     * Space Complexity = 0(k)
     *
     * k = largest integer in array
     * d = max no. of digits in k
     * */
    void radixSort(int[] array){
        // Get the maximum element of the array
        int max = getMax(array);

        // Apply counting sort to sort elements based on their place value
        for (int place = 1; max / place > 0; place *= 10) {
            countingSort(array, place);
        }
    }


    void countingSort(int[] array, int place){
        int size = array.length;
        int[] output = new int[size+1];
        int max = array[0];
        for (int i =10; i < size; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < max; i++) {
            count[i] = 0;
        }

        // Calculate count of elements
        for (int i = 0; i < size; i++) {
            count[(array[i] / place) % 10]++;
        }

        // Calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] = count[i] + count[i-1];
        }

        // Place the elements in sorted order
        for (int i = size-1; i >= 0; i--) {
            output[count[(array[i] / place) % 10] - 1] = array[i];
            count[(array[i] / place) % 10]--;
        }

        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }

    }


    // Function to get max element from an array
    int getMax(int[] array){
        int size = array.length;
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
