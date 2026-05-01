import java.util.*;
public class Search {
    static int linear(int[] a, int key) {
        for (int i = 0; i < a.length; i++) if (a[i] == key) return i;
        return -1;
    }
    static int binary(int[] a, int key) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == key) return m;
            else if (a[m] < key) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new Random().ints(10000, 0, 10000).toArray();
        Arrays.sort(arr);
        System.out.println(linear(arr, arr[500]));
        System.out.println(binary(arr, arr[500]));
    }
}