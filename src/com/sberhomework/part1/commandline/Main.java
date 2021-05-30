package com.sberhomework.part1.commandline;

/*
    Написать программу, считывающую передаваемые через командную строку параметры и
    выполняющую арифметическое действие в зависимости от считанного арифметического знака.

    Входные данные: <int число1> <знак [+, -, *, /]> <int число 2>.
    Выходные данные: результат арифметической операции.
*/

public class Main {
    public static void main(String [] args) {
        if (args.length != 3) {
            System.out.println("Wrong parameters");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);

        switch (args[1]) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
        }
    }
}
