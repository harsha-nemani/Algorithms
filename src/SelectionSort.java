public class SelectionSort {

    /*
    * Worst Case = O(n^2)
    * Best Case = O(n^2)
    * Average Case = O(n^2)
    *
    * Space Complexity = 0(1)
    * */
    void selectionSort(int[] array){
        int arrSize = array.length;

        for(int i = 0; i < arrSize-1; i++){
            int minIndex = i;

//          Select minimum element in each loop
            for(int j = i+1; j < arrSize; j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }

//          Swapping found minimum value with the current value
            swap(array, i, minIndex);
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
