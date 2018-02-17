public class MergeSort {

    public void merge(int arr[], int l, int m, int r){

        /*Finds size of left-side array*/
        int n1= m - l + 1;

        /*Finds size of right-side array*/
        int n2= r - m;

        /*Declare Left and Right temporary arrays*/
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to respective temporary arrays*/
        for(int i=0; i<n1; i++){
            L[i] = arr[l + i];
        }
        for(int j=0; j<n2; j++){
            R[j] = arr[m + 1 + j];
        }

        /*Initial indexes for two sub-arrays*/
        int i=0, j=0;

        int k=l;

        while( i < n1 && j < n2){

            if(L[i] <= R[j] ){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while( i < n1 ){
            arr[k] = L[i];
            i++;
            k++;
        }

        while( j <n2 ){
            arr[k] = R[j];
            j++;
            k++;
        }

    }

    public void sort(int []arr, int l, int r){

        if( l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, (m + 1), r);

            merge(arr, l, m, r);
        }

    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {28,4,56,45};

        printArray(arr);

        MergeSort msrot = new MergeSort();

        msrot.sort(arr,0,arr.length - 1);

        printArray(arr);

    }
}
