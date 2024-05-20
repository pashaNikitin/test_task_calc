# test_task_calc
Тестовое задание калькулятор с требованиями

ТЕСТОВАЯ ЗАДАЧА “КАЛЬКУЛЯТОР”
Описание:
Создай консольное приложение “Калькулятор”. Приложение должно читать из консоли введенные пользователем строки, числа, арифметические операции проводимые между ними и выводить в консоль результат их выполнения.
Реализуй класс Main с методом public static String calc(String input). Метод должен принимать строку с арифметическим выражением между двумя числами и возвращать строку с результатом их выполнения. Ты можешь добавлять свои импорты, классы и методы. Добавленные классы не должны иметь модификаторы доступа (public или другие)
Требования:
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается. 
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.


Пример работы программы:
Input:
1 + 2
Output:
3
Input:
1
Output:
throws Exception //т.к. строка не является математической операцией
Input:
1 + 2 1
Output:
throws Exception 
Input:
1 + 2 + 3
Output:
throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)
