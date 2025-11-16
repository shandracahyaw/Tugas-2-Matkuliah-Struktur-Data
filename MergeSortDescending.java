import java.util.Arrays;

public class MergeSortDescending {
    static int[] arr = {45, 12, 78, 23, 91, 56, 34, 67};
    public static void mergeSort(int[] array, int left, int right){
        if(left < right){
            int mid = left + (right - left) /2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
        }
    }
    public static void merge(int[] array, int left, int mid, int right){
        int n1 = mid - left +1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for(int i = 0; i < n1; ++i){
            leftArr[i] = array[left + i];
        }
        for(int j = 0; j < n2; ++j){
            rightArr[j] = array[mid + 1 + j];
        }
        int i = 0, j = 0, k = left;
        while(i  < n1 && j < n2){
            if(leftArr[i] >= rightArr[j]){
                array[k] = leftArr[i];
                i++;
            } else {
                array[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            array[k] = leftArr[i];
            i++;
            k++;
        }
        while(j < n2){
            array[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public static void printArray(int[] array){
        System.out.println("Array:" + Arrays.toString(array));
    }
    public static void main(String[]args){
        System.out.println("=====MERGE SORT DESCENDIING=====");
        System.out.println("Array Awal:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n Array setelah diurutkan (Descending):");
        printArray(arr);
    }
}