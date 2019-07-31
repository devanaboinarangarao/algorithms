import  java.util.Scanner;
class lis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = s.nextInt();
        }

        int[] lis = new int[n];
        for(int i=0; i<n; i++){
            lis[i] = 1;
        }
        for(int i=1; i<n; i++) {
            for(int j=0; j< i; j++) {
                if(arr[j] < arr[i] && lis[i] < lis[j]+1) {
                    lis[i] = lis[j]+1;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++) {
            if(lis[i] > max)
                max = lis[i];
        }
        System.out.print(max +" ");

    }
}