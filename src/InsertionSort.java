public class InsertionSort {

    void insertSortIncreasingOrder(int[] arr){
        for(int j=1; j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            /*Moving element to left until its left element is smaller*/
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
    void insertSortDecreasingOrder(int[] arr){
            for(int j=1; j<arr.length;j++){
                int key = arr[j];
                int i = j-1;
                /*Moving element to left until its left element is larger*/
                while(i>=0 && arr[i]<key){
                    arr[i+1] = arr[i];
                    i--;
                }
                arr[i+1] = key;
            }
        }
}
