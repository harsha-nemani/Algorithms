public class BubbleSort {

    void bubbleSort(int[] array){
        int size = array.length;

        for(int i=0; i < size-1; i++){
            for(int j=0; j < size-i-1; j++){
                if(array[j] > array[j+1]){
                    swap(array, j, j+1);
                }
            }
        }
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
