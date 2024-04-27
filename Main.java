package com.kir138;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        /**
         * Проверка логина и пароля
         * Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
         * Login должен содержать только латинские буквы, цифры и знак подчеркивания.
         * Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо
         * выбросить WrongLoginException.
         * Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна
         * быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует
         * этим требованиям, необходимо выбросить WrongPasswordException.
         * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя
         * конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор
         * класса Exception.
         * Обработка исключений проводится внутри метода.
         * Используем multi-catch block.
         * Метод возвращает true, если значения верны или false в другом случае.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите логин");
        String login = scanner.nextLine();
        System.out.println("введите пароль");
        String password = scanner.nextLine();
        System.out.println("повторите пароль");
        String confirmPassword = scanner.nextLine();
        Boolean verificationRes = Verification.isCheck(login, password, confirmPassword);
        System.out.println(verificationRes);
    }
}
