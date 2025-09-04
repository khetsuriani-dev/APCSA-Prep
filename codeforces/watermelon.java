import java.util.Scanner;

public class watermelon{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        System.out.println( a % 2 == 0 && a != 2 ? "YES" : "NO");
    }
}

// 4A
// https://codeforces.com/problemset/problem/4/A