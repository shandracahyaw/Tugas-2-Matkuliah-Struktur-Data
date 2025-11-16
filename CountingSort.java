import java.util.Arrays;

public class CountingSort {
    static int[] arr = {45, 12, 78, 23, 91, 56, 34, 67};

    public static void countingSort(int[] array){
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;

        int[]count = new int[range];

        for(int num : array){
            count[num - min]++;
        }

        int[]output = new int[array.length];
        int index = 0;

        for(int i = range - 1; i >= 0; i--){
            while(count[i] > 0){
                output[index++] = i + min;
                count[i]--;
            }
        }
        for(int i = 0; i < array.length; i++){
            array[i] = output[i];
        }
    }
    public static void printArray(int[]array){
        System.out.println("Array:" + Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("COUNTING SORT DESCENDING");
        System.out.println("Array Awal:");
        printArray(arr);

        countingSort(arr);

        System.out.println("\n Array setelah diurutkan(descending):");
        printArray(arr);
    }
}