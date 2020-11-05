import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {

    /*
     * Worst Case = O(n^2)
     * Best Case = O(n + k)
     * Average Case = O(n) -> holds true until the sum of the squares of the bucket sizes
     *                        is linear in the total number of elements
     *
     * */
    public void bucketSort(float[] arr){
        int size = arr.length;
        if(size < 0){
            return;
        }

        @SuppressWarnings("unchecked")
        ArrayList<Float>[] bucket = new ArrayList[size];

        // Create n buckets
        for(int i = 0; i < size; i++)
            bucket[i] = new ArrayList<Float>();

        // Add elements into the buckets
        for (int i = 0; i < size; i++) {
            int bucketIndex = (int) arr[i] * size;
            bucket[bucketIndex].add(arr[i]);
        }

        // Sort the elements of each bucket
        for (int i = 0; i < size; i++) {
            Collections.sort(bucket[i]);
        }

        int index = 0;
        for (int i = 0; i < size; i++) {
            int bucketSize = bucket[i].size();

            for (int j = 0; j < bucketSize; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}
