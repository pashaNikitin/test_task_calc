/*
тестовое задание
Никитин Павел Анатольевич
 */
import java.util.Scanner;

class Main {

    public static String calc(String input) {     // создаю метод calc который на вход принимает строкку и возращает строку

        String[] data = input.split(" ");   // создаю массив из строк и спличу(разделяю) по пробелу т зпаисываю в массив
        if(!(data.length == 3)) {                 // если в массиве "не 3 элимета" вызываю исключения, так как это не удволетвооряет условиям задания
            throw new ArrayIndexOutOfBoundsException ("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");}

        int a = Integer.parseInt(data[0]);        //  создаю тип целочисленых цифр и преобразую строку в число 1 элемента в массиве
        int b = Integer.parseInt(data[2]);        // ... 3 элемента в массиве
        String operator = data[1];                //  создаю строку и присвою ему 2 элемент массива
        String mistake = "числа должны быть от 1 до 10";
        int result;

        if ((a > 0 && b > 0) && (a < 11 && b < 11)) {    // проверяю на условие чтоб числа в вырожение были от 1 до 10 (требования задания)
            result = switch (operator) {   // использую условный оператор чтоб выполнить нужное арифмитическое действие
                case "+" -> a + b;
                case "-" -> a - b;
                case "*" -> a * b;
                case "/" -> a / b;
                default ->
                        throw new IllegalArgumentException("throws Exception //т.к. операнд не является математической операцией");   // вызываю исключения если нет нужно ариф знака
            };
            return String.valueOf(result);   // если все норрм то возрращаю результат уровнения преобразововав его в строку
        }
        return mistake;
    }

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите вырожение: ");
        String input = scanner.nextLine();
        try {                                       // ловлю исключение
            String result = calc(input);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. операнды в вырожение должны быть ЦЕЛЫМИ");  // отробатываю исключения если числа не целые (требования к заданию)
        }
    }
}
