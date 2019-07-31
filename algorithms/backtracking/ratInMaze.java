import java.util.Scanner;
class ratInMaze {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } };
        
        int sol[][] = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                sol[i][j] = 0;
            }
        }
       
        System.out.println(mazeUtil(maze, 0, 0, sol, n));
    }
    static boolean mazeUtil(int[][] maze, int i, int j, int[][] sol, int n) {
        if(i == n-1 && j == n-1) {
            sol[n-1][n-1] = 1;
            printSolution(sol, n);
            return true;
        }
        else if(maze[i][j] == 0 ||i < 0 || i >= n || j < 0 || j >= n ) {
            return false;
        } else {
            sol[i][j] = 1;
            boolean s = mazeUtil(maze, i, j+1, sol, n);
            if(s == true) {
                return true;
            }
            s = mazeUtil(maze, i+1, j, sol, n);
            if(s == true) {
                return true;
            }
            sol[i][j] = 0;
            return false;
        }
    }
    static void printSolution(int[][] maze, int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(maze[i][j] +" ");
            }
            System.out.println();
        }
    }
}