import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calc simpleCalc = new Calc();

        try (Scanner scanner = new Scanner(System.in); scanner) {
            System.out.println("Введите данные, например 4 + 2");
            String input = scanner.nextLine();
            String[] expression = input.split(" ");

            if (expression.length != 3)
                throw new IllegalArgumentException("Неверный формат ввода, пример 4 + 2");

            int a = Integer.parseInt(expression[0]);
            int b = Integer.parseInt(expression[2]);
            String operation = expression[1];

            int result = simpleCalc.calculate(a, b, operation);

            System.out.println(result);

        } catch (NumberFormatException e) {
            System.err.println("Ошибка: Введите только целые числа от 1 до 10 включительно");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}