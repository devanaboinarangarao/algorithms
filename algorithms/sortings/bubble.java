import java.io.Console;
import java.util.Scanner;
public class bubble {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t >  0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i = 0;i < n;i++) {
                arr[i] = s.nextInt();
            }
            int swapped = 1;
            for(int i = 0; i< n-1 && swapped != 0;i++) {
                swapped = 0;
                for(int j=i+1; j<n;j++) {
                    if(arr[i] > arr[j]) {
                        int swap = arr[i];
                        arr[i] = arr[j];
                        arr[j] = swap;
                        swapped = 1;
                    }
                }
            }
            for(int i = 0;i < n;i++) {
                System.out.print(arr[i] +" ");
            }
            t--;
        }
    }
}