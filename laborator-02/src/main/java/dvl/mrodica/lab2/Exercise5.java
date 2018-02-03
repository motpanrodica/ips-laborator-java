package dvl.mrodica.lab2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce operatoru ( +, -, * or /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Introduceti numerele: ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.print(number1 + "+" + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.print(number1 + "-" + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.print(number1 + "*" + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.print(number1 + "/" + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }
    }
}
