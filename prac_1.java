import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new Random().ints(10000, 0, 10000).toArray();
        long start = System.nanoTime();
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}