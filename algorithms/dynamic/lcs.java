import java.util.Scanner;

class lcs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1 = s.next();
        String str2 = s.next();

        char str1Arr[] = str1.toCharArray();
        char str2Arr[] = str2.toCharArray();

        System.out.println(lcs(str1Arr, str2Arr, str1.length(), str2.length()));
    }
    static int lcs(char[] str1Arr, char[] str2Arr, int m, int n) {
        int result[][] = new int[m+1][n+1];

        for(int i=0; i<=m; i++) {
            for(int j=0; j<=n; j++) {
                if(i==0 || j==0) {
                    result[i][j] = 0;
                }
                else if(str1Arr[i-1] == str2Arr[j-1]) {
                    result[i][j] = result[i-1][j-1]+1;
                } else {
                    result[i][j] = max(result[i-1][j], result[i][j-1]);
                }
            }
        }

        return result[m][n];

    }
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}