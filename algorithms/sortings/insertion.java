import java.io.Console;
import java.util.Scanner;
public class insertion {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t >  0) {
            int n = s.nextInt();
            int arr[] = new int[n];

            for(int i = 0;i < n;i++) {
                arr[i] = s.nextInt();
            }
            for(int i = 1; i < n; i++) {
                int el = arr[i];
                int j = i;
                while(j >= 1 && arr[j-1] > el) {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = el; 
            }
            for(int i = 0;i < n;i++) {
                System.out.print(arr[i] +" ");
            }
            t--;
        }
    }
}