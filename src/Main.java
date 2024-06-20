import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число 'a' ");
        int a = in.nextInt();

        System.out.println("Введите целое число 'b' ");
        int b = in.nextInt();

        int resultMax;
        if (a > b){
            resultMax = a;
        } else {
            resultMax = b;
        }
        System.out.println("Наибольшее число: " + resultMax);

        System.out.println("Сумма чисел 'a' и 'b' = " + (a + b));
        System.out.println("Разница чисел 'a' и 'b' = " + (a - b));
        System.out.println("Умножение чисел 'a' и 'b' = " + (a * b));
        System.out.println("Деление чисел 'a' и 'b' = " + (a / b));     //Так как в операции целые числа, результат
                                                                        // будет округлён до целого числа

        }
    }
