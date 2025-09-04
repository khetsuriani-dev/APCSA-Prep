import java.util.Scanner;

public class theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();
        long flagstonesAlongN = (n + a - 1) / a;
        long flagstonesAlongM = (m + a - 1) / a;
        long totalFlagstones = flagstonesAlongN * flagstonesAlongM;
        System.out.println(totalFlagstones);
    }
}

// 1A
// https://codeforces.com/problemset/problem/1/A