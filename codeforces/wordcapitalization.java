import java.util.*;

public class wordcapitalization{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String str = i.nextLine();
        String str1 = "";
        for (int j = 0; j < str.length(); j++) {
            if (j == 0) {
                str1 = str1 + Character.toString(str.charAt(j)).toUpperCase();
            } else {
                str1 = str1 + Character.toString(str.charAt(j));
            }
        }
        System.out.println(str1);
    }
}

// 281A
// https://codeforces.com/problemset/problem/281/A