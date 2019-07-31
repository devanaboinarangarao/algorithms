import java.io.Console;
import java.util.Scanner;
public class selection {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t >  0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i = 0;i < n;i++) {
                arr[i] = s.nextInt();
            }
            for(int i=0; i<n-1; i++) {
                int min = i;
                for(int j=i+1;j<n;j++){
                    if(arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int swap = arr[i];
                arr[i] = arr[min];
                arr[min] = swap;
            }
            for(int i = 0;i < n;i++) {
                System.out.print(arr[i] +" ");
            }
            t--;
        }
    }
}