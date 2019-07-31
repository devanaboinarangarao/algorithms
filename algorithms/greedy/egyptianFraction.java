import java.util.*;
public class egyptianFraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while(t > 0) {
            int nr = s.nextInt();
            int dr = s.nextInt();

            egyptianFraction(nr, dr);
            t--;
        }
    }
    static void egyptianFraction(int nr, int dr) {
        if( nr == 0 || dr == 0) {
            return ;
        }
        if(dr % nr == 0 ) {
                System.out.print(1+"/"+(dr/nr) +" ");
                return;
        }
        if(nr % dr == 0) {
            System.out.print(nr/dr +" ");
            return;
        }

        if(nr > dr) {
            System.out.print(nr/dr +" + ");
            egyptianFraction(nr%dr, dr);
            return;
        }

        int n = dr/nr +1;
        System.out.print(1+"/"+n +" + ");
        egyptianFraction(n*nr-dr, n*dr);

    }
}