package PjBL4;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        BubbleSort bubbleSorter = new BubbleSort();
        InsertionSort insertionSorter = new InsertionSort();
        QuickSort quickSorter = new QuickSort();

        int[] arrayToSort = originalArray.clone();
        System.out.println("Array original: ");
        print(originalArray);
        bubbleSorter.sort(arrayToSort);
        System.out.println("Array ordenado com Bubble Sort: ");
        print(arrayToSort);

        System.out.println("Array original: ");
        print(originalArray);
        arrayToSort = originalArray.clone();
        insertionSorter.sort(arrayToSort);
        System.out.println("Array ordenado com Insertion Sort: ");
        print(arrayToSort);

        System.out.println("Array original: ");
        print(originalArray);
        arrayToSort = originalArray.clone();
        quickSorter.sortArray(arrayToSort);
        System.out.println("Array ordenado com Quick Sort: ");
        print(arrayToSort);
    }
    public static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
