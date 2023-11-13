package PjBL4;

public class BubbleSort{
    public void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            boolean isOrdered = true;
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                    isOrdered = false;
                }
            }
            if(isOrdered)
                break;
        }
    }
}
