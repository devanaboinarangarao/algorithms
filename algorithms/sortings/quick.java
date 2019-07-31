import java.util.*;
public class quick {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        while(t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = s.nextInt();
            }
            // int p =partition(arr, 0, n);
            quickSort(arr, 0, n);

            for(int i=0; i<n; i++) {
                System.out.print(arr[i] +" ");
            }
            t--;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if(low < high) {
            int p = partition(arr, low, high);
    
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        } else {
            for(int i=0; i<5; i++) {
                System.out.print(arr[i] +" ");
            }
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = high-1;
        int i = low;
        while(i < pivot) {
            if(arr[i] > arr[pivot]) {
                int swap = arr[pivot];
                arr[pivot] = arr[pivot-1];
                arr[pivot-1] = swap;

                if(pivot-1 != i) {
                    swap = arr[pivot];
                    arr[pivot] = arr[i];
                    arr[i] = swap;
                }
                pivot--;
            } else {
                i++;
            }
        }
        System.out.println(pivot);
        for(int j=low; j<high; j++) {
            System.out.print(arr[j] +" ");
        }
        System.out.println();
        return pivot;
    }
}