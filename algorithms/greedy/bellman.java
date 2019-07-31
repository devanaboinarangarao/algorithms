import java.util.*;

public class bellman {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            int n = 5;
            int e = 8;
            int start = s.nextInt();
            // int G[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, { 4, 0, 8, 0, 0, 0,
            // 0, 11, 0 },
            // { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, { 0, 0, 0, 9,
            // 0, 10, 0, 0, 0 },
            // { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, { 8, 11, 0,
            // 0, 0, 0, 1, 0, 7 },
            // { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };

            // int G[][] = new int[][] { { 0, 3, 1, 0, 0 }, { 3, 0, 7, 5, 1 },
            // { 1, 7, 0, 2, 0 }, { 0, 5, 2, 0, 7 }, { 0, 1, 0, 7, 0 }};

            int G[][] = new int[][] { { 0, 1, -1 }, { 0, 2, 4 }, { 1, 2, 3 }, { 1, 3, 2 }, { 1, 4, 2 }, { 3, 2, 5 },
                    { 3, 1, 1 }, { 4, 3, -3 } };

            // for(int i=0; i<n; i++) {
            // for(int j=0; j<n; j++) {
            // System.out.printf("Weight between %d and %d ",i, j);
            // G[i][j] = s.nextInt();
            // G[j][i] = G[i][j];
            // }
            // }
            int[] distance = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == start) {
                    distance[i] = 0;
                    continue;
                }
                distance[i] = Integer.MAX_VALUE;
            }
            int[] res = shortestPath(G, n, e, start, distance);
            for (int i = 0; i < n; i++) {

                System.out.printf(i + " tts " + res[i] + " \n");
            }
            t--;
        }
    }

    static int[] shortestPath(int[][] G, int n, int e, int start, int[] distance) {
        int v[] = new int[n];
        for (int j = 0; j < n - 1; j++) {
            int el = findMinimum(v, distance);
            v[el] = 1;
            for (int i = 0; i < e; i++) {
                if (distance[G[i][0]] + G[i][2] < distance[G[i][1]])
                    distance[G[i][1]] = distance[G[i][0]] + G[i][2];
            }
        }
        return distance;
    }

    static int findMinimum(int[] v, int[] distance) {
        int index = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < distance.length; i++) {
            if (v[i] != 1 && distance[i] < min) {
                min = distance[i];
                index = i;
            }
        }
        return index;
    }

}