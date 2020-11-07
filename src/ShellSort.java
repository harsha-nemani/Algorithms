public class ShellSort {
    public void shellSort(int array[]){
        int size = array.length;
        int temp;
        for (int interval = size/2; interval > 0; interval = interval/2){
            for (int i = interval; i < size; i++) {
                temp = array[i];
                int j;
                for(j = i; j >= interval && array[j - interval] > temp; j = j - interval){
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }
}
