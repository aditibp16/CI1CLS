import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble(); 
        double b = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double result;
        switch (operator) {
            case '+':
                result = a+b;
                System.out.println(result);
                break;
            case '-':
                result =a-b;
                System.out.println(result);
                break;
            case '*':
                result =a*b;
                System.out.println(result);
                break;
            case '/':
                if (b!= 0) {
                    result =a/b;
                    System.out.println(result);
                } else {
                    System.out.println("no ans");
                }
                break;
            default:
                System.out.println("the code gone wrong");
        }

        scanner.close();
    }
}
