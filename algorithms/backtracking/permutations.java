import java.util.Arrays;
import java.util.Scanner;

class permutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.next();

        char strArr[] = str.toCharArray();

        int visited[] = new int[strArr.length];
        Arrays.fill(visited, 0);
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
}