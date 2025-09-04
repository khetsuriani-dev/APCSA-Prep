public class concat {
    public static void main(String[] args) {
        String a = "hello";
        String b = "world";
        String c = "!";
        System.out.println(a + " " + b + " " + c);
        String result = a + b + c;
        String result2 = a.concat(b).concat(c);
        System.out.println("Result 1: " + result);
        System.out.println("Result 2: " + result2);
    }
}