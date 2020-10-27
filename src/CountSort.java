public class CountSort {

    /*
     * Worst Case = O(n+k)
     * Best Case = O(n+k)
     * Average Case = O(n+k)
     *
     * Space Complexity = 0(k)
     *
     * k = largest integer in array
     * */
    void countSort(int[] array){
        int size = array.length;
        int[] output = new int[size+1];

//      Find the largest element of the array
        int max = array[0];
        for(int i=1; i< size; i++){
            if(array[i] > max)
                max = array[i];
        }

//      Initialize count array with all zeros
        int[] count = new int[max+1];
        for(int i = 0; i < max; i++){
            count[i] = 0;
        }

//      Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

//      Store the cumulative count of each array
        for(int i=0; i <= max; i++){
            count[i] = count[i] + count[i-1];
        }

//      Find the index of each element of the original array in count array and
//      place the elements in output array
        for(int i=0; i < size; i++){
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

//      Copy the sorted elements into original array
        for(int i=0; i < size; i++){
            array[i] = output[i];
        }


    }
}
