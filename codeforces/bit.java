import java.util.Scanner;

public class bit{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num = i.nextInt();
        i.nextLine();
        int x = 0;
        for (int j = 0; j < num; j++){
            String z = i.nextLine();
            if (z.contains("--")) {
                x--;
            }else {
                x++;
            }
        } 
        System.out.println(x);
    }
}

// 282A
// https://codeforces.com/problemset/problem/282/A
