import java.util.Scanner;
public class binary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0 ) {
            int n = s.nextInt();
            int el = s.nextInt();

            int arr[] = new int[n];

            for(int i=0; i<n; i++) {
                arr[i] = s.nextInt();
            }

            int index = binarySearch(arr,0, n,  el);
            // System.out.print(index);
            String str = "";
            str = index == -1 ? "element not found in given array" : "element found at index "+ index;
            System.out.println(str);
            t--;
        }
    }
    public static int binarySearch(int[] arr, int low, int high, int el) {
        
        if(low <= high) {
            int mid = (low+high)/2;

            if(arr[mid] == el) {
                return mid;
            } else if(arr[mid] > el) {
                return binarySearch(arr, low, mid-1, el);
            }
            return binarySearch(arr, mid+1, high, el);
        }
        return -1;
    }
}