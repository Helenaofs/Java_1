//Реализовать простой калькулятор
 
import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("Введите тип операции, которую хотите реализовать (+, -, *, /, %) - ");
        char op = scanner.next().charAt(0);
        solve(a, b, op);
    }

    public static int solve(int a, int b, char op) {
        int res = 0;
        if (op == '+') {
            res = a + b;
        } else if (op == '-') {
            res = a - b;
        } else if (op == '*') {
            res = a * b;
        } else if (op == '%') {
            res = a % b;
        } else if (op == '/') {
            res = a / b;
        }
        System.out.format("Ваш ответ - %d", res);
        return res;
    }
}
