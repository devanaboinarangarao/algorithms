import java.util.*;
public class activities {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();
            int start[] = new int[n];
            int finish[] = new int[n];

            for(int i=0; i<n; i++) {
                start[i] = s.nextInt();
            }
            for(int i=0; i<n; i++) {
                finish[i] = s.nextInt();
            }
            for(int i=0; i<start.length-1; i++) {
                int min = i;

                for(int j=i+1;j<n;j++) {
                    if(finish[j] < finish[min]) {
                        min = j;
                    }
                }
                int swap = finish[min];
                finish[min] = finish[i];
                finish[i] = swap;
                
                int swap2 = start[min];
                start[min] = start[i];
                start[i] = swap2;
            }
            getActivities(start, finish, n);
            t--;
        }
    }
    public static void getActivities(int[] start, int[] finish, int n) {
        System.out.printf("Activity %d is selected \n", 0);
        int j = 0;
        for(int i=1; i<n; i++) {
            if(start[i] >= finish[j]) {
                System.out.printf("Activity %d is selected \n", i);
                j = i;
            }
        }
    }
   
}