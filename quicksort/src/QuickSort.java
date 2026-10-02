public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,2,5,8,9,1,7,4,6};
        System.out.print("Testing QuickSort on array -> ");
        printArr(arr);
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return;
        int pivot = partition(arr, start, end);
        quickSort(arr, 0, pivot - 1 );
        quickSort(arr, pivot + 1, end);
    }
    public static int partition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for(int j = start; j < end; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;


        return i;
    }
    public static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

}
