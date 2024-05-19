/*
тестовое задание
Никитин Павел Анатольевич
 */
import java.util.Scanner;

class Main {

    public static String calc(String input) {

        String[] data = input.split(" ");
        if(!(data.length == 3)) {
            throw new ArrayIndexOutOfBoundsException ("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}

        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[2]);
        String operator = data[1];
        String mistake = "числа должны быть от 1 до 10";
        int result;

        if ((a > 0 && b > 0) && (a < 11 && b < 11)) {
            result = switch (operator) {
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default ->
                        throw new IllegalArgumentException("throws Exception //т.к. операнд не является математической операцией");
            };
            return String.valueOf(result);
        }
        return mistake;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите вырожение: ");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. операнды в вырожение должны быть ЦЕЛЫМИ");
        }
    }
}
