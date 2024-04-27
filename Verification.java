package com.kir138;
import java.util.regex.Pattern;

public class Verification {
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
    private String login;
    private String password;
    private String confirmPassword;

    public Verification() {
    }

    public Verification(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean isCheck(String login, String password, String confirmPassword) throws WrongLoginException,
            WrongPasswordException {
        boolean loginCheck = Pattern.matches("[a-zA-Z0-9_]+", login);
        boolean loginLength = login.length() <= 20;
        if (!loginCheck) {
            throw new WrongLoginException("Неправильный формат логина");
        } else if (!loginLength) {
            throw new WrongLoginException("Логин слишком длинный");
        }
        boolean passwordCheck = Pattern.matches("[a-zA-Z0-9_]+", password);
        boolean passwordLength = password.length() <= 20;
        if (!passwordCheck) {
            throw new WrongPasswordException("Неправильный формат пароля");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        } else if (!passwordLength) {
            throw new WrongPasswordException("Пароль слишком длинный");
        }
        return true;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "Verification{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
