import java.util.Scanner;

public class toolong{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int a = i.nextInt();
        i.nextLine();
        while (a > 0){
            String word = i.nextLine();
            if (word.length() > 10) {
                System.out.println("" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length()-1));
            } else {
                System.out.println(word);
            }
            a--;
        }
    }
}

// 71A
// https://codeforces.com/problemset/problem/71/A