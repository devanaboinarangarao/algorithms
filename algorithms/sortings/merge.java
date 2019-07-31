import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = s.nextInt();
            }
            arr = mergeSort(arr);
            for(int i=0; i<n; i++) {
                System.out.print(arr[i] +" ");
            }
            t--;
        }
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }

        int length = arr.length;
        int mid = (int)Math.floor(length/2);

        int left[] = sliceArr(arr, 0, mid);
        int right[]= sliceArr(arr, mid, length);
        System.out.print("left is :");
        for(int i=0; i<left.length; i++) {
            System.out.print( left[i] +" ");
        }
        System.out.println();
        System.out.print("right is :");

        for(int i=0; i<right.length; i++) {
            System.out.print(right[i] +" ");
        }

        return mergeArrs(mergeSort(left), mergeSort(right));
    }
    public static int[] sliceArr(int[] arr, int start, int end) {
        int slice[] = new int[end-start];
        int k = 0;
        for(int i=start; i<end; i++) {
            slice[k++] = arr[i];
        }
        return slice;
    }

    public static int[] mergeArrs(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length+ arr2.length];

        int left=0, right=0, k=0;

        while(left != arr1.length && right != arr2.length) {
            if(arr1[left] < arr2[right]) {
                arr3[k++] = arr1[left++];
            } else {
                arr3[k++] = arr2[right++];
            }
        }
        if(left == arr1.length) {
            while(right < arr2.length) {
                arr3[k++] = arr2[right++];
            }
        } if(right == arr2.length) {
            while(left < arr1.length) {
                arr3[k++] = arr1[left++];
            }
        }
        System.out.print("merged array is ");
        for(int i=0; i<arr3.length; i++) {
            System.out.print(arr3[i] +" ");
        }
        System.out.println();
        return arr3;
    }
}