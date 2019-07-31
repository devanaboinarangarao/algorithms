import java.util.Scanner;

public class strReverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t > 0) {
            
            String str = s.next();

            char strArr[] = new char[str.length()];
            
            strArr = str.toCharArray();
            reverse(strArr, 0);
            System.out.println();
            t--;
        }
    }
    public static void reverse(char[] strArr, int index) {

        if(index == strArr.length) {
            return ;
        }
        reverse(strArr, index+1);
        System.out.print(strArr[index]);
        // return;
    }
}