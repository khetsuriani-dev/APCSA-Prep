import java.util.*;

public class bear{
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        long a = i.nextLong();
        long b = i.nextLong();
        int counter = 0;
        while (a <= b){
            counter++;
            a= a*3;
            b= b*2;
        }
        System.out.println(counter);
    }
}

// 791A
// https://codeforces.com/problemset/problem/791/A