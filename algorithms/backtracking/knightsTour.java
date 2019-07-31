import java.util.Scanner;
class knightsTour {
    public static void main(String[] args) {
        solveKt();
    }
    static int n = 8;
    static boolean solveKt() {
        int sol[][] = new int[8][8];

        for(int i=0; i<8; i++) {
            for(int j=0; j<8; j++) {
                sol[i][j] = -1;
            }
        }

        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        sol[0][0] = 0;

        if(!solveKtUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution doest not exists");
            return false;
        } else {
            for(int i=0; i<8; i++) {
                for(int j=0; j<8; j++) {
                    System.out.print(sol[i][j] +"\t");
                }
                System.out.println();
            }
        }
        return true;
    }
    static boolean solveKtUtil(int i, int j, int movei, int[][] sol, int[] xMove, int[] yMove ) {
        int nextXMove, nextYMove;
        if(movei == n*n) {
            return true;
        } else {
            for(int k=0; k<8; k++) {
                nextXMove = i + xMove[k];
                nextYMove = j + yMove[k];

                if(isSafe(nextXMove, nextYMove, sol)) {
                    sol[nextXMove][nextYMove] = movei;

                    if(solveKtUtil(nextXMove, nextYMove, movei+1, sol, xMove, yMove)) {
                        return true;
                    } else {
                        sol[nextXMove][nextYMove] = -1;
                    }

                }
            }
            return false;
        }
    }
    static boolean isSafe(int i, int j, int[][] sol) {
        return (i >=0 && i <= n-1 && j >=0 && j<= n-1 && sol[i][j] == -1);
    }
}