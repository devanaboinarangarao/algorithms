import java.util.Scanner;
class wayHome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();
        int c = s.nextInt();

        int G[][] = new int[r][c];

        for(int i=0; i<r-1; i++) {
            G[i][c-1] = 1;
        }
        for(int i=0; i<c-1; i++) {
            G[r-1][i] = 1;
        }
        for(int i = r-2; i>=0; i--) {
            for(int j=c-2; j>=0; j--) {
                G[i][j] = G[i+1][j]+G[i][j+1];
            }
        }
        System.out.println(G[0][0]);
    }
}