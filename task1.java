// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n =  scanner.nextInt();
        scanner.close();
        
        int sum = 0;
        int mult = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            mult = mult * i;
        }
        System.out.format("Сумма чисел: %d", sum);
        System.out.format("\nПроизведение чисел: %d", mult);
    }
}