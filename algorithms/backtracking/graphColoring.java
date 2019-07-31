import java.util.Arrays;
import java.util.Scanner;
class graphColoring {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       int v = 4;
       int n = 3;

       int[][] G = {{0, 1, 1, 1}, 
       {1, 0, 1, 0}, 
       {1, 1, 0, 1}, 
       {1, 0, 1, 0}};

    //    for(int i=0; i<v; i++) {
    //        for(int j=0; j<v; j++) {
    //            G[i][j] = s.nextInt();
    //        }
    //    }
       int colors[] = new int[v];
       Arrays.fill(colors, 0);

       graphColoring(G, 0,v, n,  colors);
       
      
    }
    static boolean graphColoring(int[][] G, int v,int V, int n, int[] colors) {
        if(v == V) {
            for(int i=0; i<V; i++) {
                System.out.print(colors[i] +" ");
            }
            return true;
        } else {
            for(int i=1; i<=n; i++) {
                if(isSafe(v, i, G, V, colors)) {
                    colors[v] = i;
                    
                    if(graphColoring(G, v+1, V, n, colors)) {
                        return true;
                    }
                    colors[v] = 0;
                }
            }
            return false;
        }
    }
    static boolean isSafe(int v, int c, int[][] G, int V, int[] colors) {
        for(int j=0; j<V; j++) {
            if(G[v][j] == 1 && colors[j] == c ) {
                return false;
            }
        }
        return true;
    }

}