/*Calculator program-modified*/
import java.util.Scanner;

public class CalAdd {
    public static void main(String[] args) {
        float a, b, result;
        char choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Exit \n");
            System.out.println("Enter choice: ");
            choice = sc.next().charAt(0);
            switch (choice) {
                case '1':
                    System.out.println("Enter two numbers:");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    result = a + b;
                    System.out.println("Result = " + result);
                    break;
                case '2':
                    System.out.println("Enter two numbers:");
                    a = sc.nextFloat();
                    b = sc.nextFloat();
                    result = a - b;
                    System.out.println("Result = " + result);
                    break;
                case '3':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
            System.out.println("\n --------------------------------------------------- \n");
        } while (choice != 3);
    }
}
