import java.util.Scanner;
class nQueens {
    static int n;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        n = s.nextInt();

        char Chess[][] = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                Chess[i][j] = '-';
            }
        }
        nQueens(Chess, 0, n);
    }
    static void nQueens(char[][] Chess, int r, int n) {
        if( r == n) {
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    System.out.print(Chess[i][j] +" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        } 
        for(int i=0; i<n; i++) {
            if(isSafe(Chess, r, i)) {
                Chess[r][i] = 'Q';

                nQueens(Chess, r+1, n);

                Chess[r][i] = '-';
            }
        }
    }
    static boolean isSafe(char Chess[][], int r, int c) {
        // should not in same column
        for(int i=0; i<n; i++) {
            if(Chess[i][c] == 'Q' ) {
                return false;
            }
        }
        for(int i=r,j=c;i>=0 && j>=0; i--,j--) {
            if(Chess[i][j] == 'Q') {
                return false;
            }
        }
        for(int i=r,j=c;i>=0 && j<n; i--,j++) {
            if(Chess[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}