import java.util.*;

public class calculator{
    static void asdm() {
        Scanner j = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = j.nextDouble();
        System.out.println("Enter second number:");
        double num2 = j.nextDouble();
        System.out.println("Choose your operation (+ , -, /, *):");
        char choice = j.next().charAt(0);
        double result = 0;
        switch (choice) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                if(num2 == 0){
                    System.out.println("Can't divide with 0");
                    return;
                }   result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid!");
                return;
        }
        System.out.println("Result: " + result);
    }

    static void pa() {
        Scanner j = new Scanner(System.in);
        System.out.println("Enter length:");
        double l = j.nextDouble();
        System.out.println("Enter width:");
        double w = j.nextDouble();
        double perimeter = 2 * (l + w);
        double area = l * w;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    static void cap() {
        Scanner j = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = j.nextDouble();
        double perimeter = 2 * 3.14 * r;
        double area = 3.14 * r * r;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("Calculator");
        System.out.println("Choose an option: \n 1) Addition, Subtraction, Division, Multiplication \n 2) Perimeter and Area \n 3) Circle Area and Perimeter ");
        int choice = i.nextInt();
        switch (choice) {
            case 1:
                asdm();
                break;
            case 2:
                pa();
                break;
            case 3:
                cap();
                break;
            default:
                System.out.println("Error!");
                break;
        }
    }
}

// Wrote this program solely for testing my capabilities of using voids and switch cases. 