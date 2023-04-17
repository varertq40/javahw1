/* Вычислить n-ое тругольного числа(сумма чисел
от 1 до n), n!(произведение чисел от 1 до n). */

import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = in.nextInt();
        int t = n * (n + 1) / 2;
        int f = (n-2) * (n -1) * n;
        System.out.printf("%d треугольного числа равно %d \n факторил числа %d равно %d", n, t, n, f);
        in.close();

    }
}

