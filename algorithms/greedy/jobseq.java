import java.util.*;
public class jobseq {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0) {
            int n = s.nextInt();
            char jobs[] = new char[n];
            int d[] = new int[n];
            int p[] = new int[n];

            for(int i=0; i<n; i++) {
                jobs[i] = s.next().charAt(0);
                d[i] = s.nextInt();
                p[i] = s.nextInt();
            }
            for(int i=0; i<n-1; i++) {
                int max = i;
                for(int j=i+1; j<n; j++) {
                    if(p[j] >= p[max]) {
                        max = j;
                    }
                }
                int swap = p[i];
                p[i] = p[max];
                p[max] = swap;

                char swap2 = jobs[i];
                jobs[i] = jobs[max];
                jobs[max] = swap2;

                int swap3 = d[i];
                d[i] = d[max];
                d[max] = swap3;
            }
            for(int i=0; i<n; i++) {
                System.out.print(jobs[i] +" "+d[i] +" "+p[i]);
            }
            System.out.println();
            char result[] = new char[n];
            boolean slot[] = new boolean[n];
            for(int i=0; i<n; i++) {
                slot[i] = false;
            }
            for(int i=0; i<n; i++) {
                for(int j=n-1; j>=0; j--) {
                    if(slot[j] == false) {
                        result[j] = jobs[i];
                        slot[j] = true;
                        break;
                    }
                }
            }
            for(int i=0; i<n; i++) {
                if(slot[i] == true) {
                    System.out.print(result[i] +" ");
                }
            }
            
            t--;
        }
    }
}