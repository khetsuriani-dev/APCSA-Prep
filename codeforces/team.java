import java.util.Scanner;

public class team{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int t = i.nextInt();
        int x = 0;
        while (t > 0){
            int z = 0;
            int a = i.nextInt();
            int b = i.nextInt();
            int c = i.nextInt();
            if (a == 1 && b == 1 || b == 1 && c == 1 || c == 1 && a == 1) {
                z=z+1;
            }
            if (z > 0) {
                x= x+1;
            }
            t--;
        }
        System.out.println(x);
    }
}

// 231A
// https://codeforces.com/problemset/problem/231/A