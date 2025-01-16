public class Calc {

    public void numCheck(int a, int b){
        if (a > 10 || a < 1 || b > 10 || b < 1 )
            throw new IllegalArgumentException("Числа должны быть в диапазоне от 1 до 10");
    }

    public int calculate(int a, int b, String operation){
        numCheck(a, b);
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" ->  a / b;
            default ->
                    throw new IllegalArgumentException("Неверная операция! Калькулятор принмает \"+\", \"-\", \"*\",\"/\"");
        };
    }
}
