package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1: FizzBuzz от 1 до 500");
        printFizzBuzz();

        System.out.println("\nЗадача 2: Реверс строки \"make install\"");
        System.out.println(reverseString("make install"));

        System.out.println("\nЗадача 3: Квадратное уравнение");
        System.out.println(solveQuadratic(1, -3, 2));

        System.out.println("\nЗадача 4: Сумма ряда");
        System.out.println(sumSeries());

        System.out.println("\nЗадача 5: Проверка на палиндром");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    // ЗАДАЧА 1: FizzBuzz
    // Перебираем числа от 1 до 500 и выводим fizz, buzz или fizzbuzz
    public static void printFizzBuzz() {
        for (int i = 1; i <= 500; i++) {
            System.out.print(fizzBuzz(i) + " ");
        }
        System.out.println();
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0 && number % 7 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "fizz";
        } else if (number % 7 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    // ЗАДАЧА 2: Реверс строки
    // Возвращает строку, записанную наоборот
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // ЗАДАЧА 3: Квадратное уравнение
    // Решает ax^2 + bx + c = 0. Если корней нет - возвращает сообщение
    public static String solveQuadratic(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            return "нет вещественных корней";
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return "Один корень: x = " + x;
        } else {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return "Два корня: x1 = " + x1 + ", x2 = " + x2;
        }
    }

    // ЗАДАЧА 4: Сумма ряда
    // Сумма от n=2 до бесконечности 1/(n^2 + n - 2)
    // Считаем пока член ряда не станет меньше 10^-6
    public static double sumSeries() {
        double sum = 0;
        int n = 2;
        double term;
        do {
            term = 1.0 / (n * n + n - 2);
            sum += term;
            n++;
        } while (term >= 1e-6);
        return sum;
    }

    // ЗАДАЧА 5: Палиндром
    // Проверяет, читается ли строка одинаково в обе стороны
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }
}