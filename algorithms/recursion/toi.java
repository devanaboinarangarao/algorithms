import java.util.Scanner;

public class toi {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            
            int n = s.nextInt();

            toi(n, "A", "B", "C");
            
            t--;
        }
    }
    public static void toi(int n, String s, String a, String d) {
        if(n == 1) {
            System.out.printf("Move %d From %s to %s\n", n,s,d);
            return ;
        } 
        toi(n-1, s, d, a);
        System.out.printf("Move %d From %s to %s\n", n, s, d);
        toi(n-1, a, s, d);
    }
}