import java.util.Scanner;
public class Task1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Введите целое число a: ");
            int a = scanner.nextInt();

            System.out.print("Введите целое число b: ");
            int b = scanner.nextInt();


            if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }


            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));


            if (b != 0) {
                System.out.println("a / b = " + ((double) a / b));
            } else {
                System.out.println("Невозможно выполнить деление на ноль");
            }

            System.out.println("a * b = " + (a * b));
        }
    }

