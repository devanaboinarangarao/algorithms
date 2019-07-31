import java.util.Scanner;
class editDistance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        System.out.println("String edit distance is " +editDistance(str1, str2, str1.length(), str2.length()));
    }
    static int editDistance(String str1, String str2, int m, int n) {
        int sol[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i == 0) {
                    sol[i][j] = j;
                }
                else if( j== 0) {
                    sol[i][j] = i;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1)) {
                    sol[i][j] = sol[i-1][j-1];
                }
                else {
                    sol[i][j] = 1 + min(sol[i-1][j], sol[i][j-1], sol[i-1][j-1]);
                }
            }
        }
        return sol[m][n];
    }
    static int min(int a, int b, int c) {
        if(a < b && a < c) {
            return a;
        }
        else if(b < c && b < a) {
            return b;
        } else {
            return c;
        }
    } 
}