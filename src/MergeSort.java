public class MergeSort {

    public void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex){

        /*Finds size of left-side array*/
        int leftArrayLen= middleIndex - leftIndex + 1;

        /*Finds size of right-side array*/
        int rightArrayLen= rightIndex - middleIndex;

        /*Declare Left and Right temporary arrays*/
        int[] LeftArray = new int[leftArrayLen];
        int[] RightArray = new int[rightArrayLen];

        /*Copy data to respective temporary arrays*/
        for(int i=0; i<leftArrayLen; i++){
            LeftArray[i] = arr[leftIndex + i];
        }

        for(int j=0; j<rightArrayLen; j++){
            RightArray[j] = arr[middleIndex + 1 + j];
        }

        /*Initial indexes for two sub-arrays*/
        int i=0, j=0;
        int k=leftIndex;

        /*Copying smaller element from sorted array to main array */
        while( i < leftArrayLen && j < rightArrayLen){

            if(LeftArray[i] <= RightArray[j] ){
                arr[k] = LeftArray[i];
                i++;
            }
            else{
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }

        /*Copying leftover elements of Left subarray to main array*/
        while( i < leftArrayLen ){
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        /*Copying leftover elements of Right subarray to main array*/
        while( j <rightArrayLen ){
            arr[k] = RightArray[j];
            j++;
            k++;
        }

    }

    public void sort(int []arr, int leftIndex, int rightIndex){
        if( leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            sort(arr, leftIndex, middleIndex);
            sort(arr, (middleIndex + 1), rightIndex);
            merge(arr, leftIndex, middleIndex, rightIndex);
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
