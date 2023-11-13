package PjBL4;

public class QuickSort {
    public void sortArray(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    private void quickSort(int[] array, int start, int end) {
        if(end > start) {
            int indexPivot = divide(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
    }
    private int divide(int[] array, int start, int end) {
        int pivot, left, right = end;
        left = start + 1;
        pivot = array[start]; // Pivô utilizado será o elemento inicial do array
        while(left <= right) {
            while(left <= right && array[left] <= pivot) {
                left++;
            }
            while(right >= left && array[right] > pivot) {
                right--;
            }
            if(left < right) {
                swap(array, right, left);
                left++;
                right--;
            }
        }
        swap(array, start, right);
        return right;
    }
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
