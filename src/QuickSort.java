public class QuickSort {

    void quickSort(int[] array, int low, int high){
        if(low < high){

            // Selects the pivot and places all the elements
            // lesser than pivot on its left and
            // greater than pivot on its right
            int pivot = partition(array, low, high);

            // Sort the elements on the left of pivot
            quickSort(array, low, pivot-1);

            // Select the elements on right of pivot
            quickSort(array, pivot+1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
//      Select the pivot element
        int pivot = array[high];
        int i = low - 1;

//      Arranges elements lesser than pivot to left
//      and greater than pivot to right
        for(int j=low; j < high; j++){
            if(array[j] <= pivot){
                i++;
                swap(array, i, j);
            }
        }

//      Places pivot between left and right subarrays
        swap(array, i+1, high);
        return (i+1);
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}
