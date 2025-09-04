public class swich{
    public static void main(String[] args) {
        int age = 21;
        switch (age >= 21 ? 1 : 0) {
            case 1:
                System.out.println("Old enough!");
                break;
            default:
                System.out.println("Not Yet!");
        }
    }
}