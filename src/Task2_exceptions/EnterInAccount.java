package Task2_exceptions;

import java.util.Scanner;

public class EnterInAccount {
    String login;
    String password;
    String confirmPassword;

    public EnterInAccount(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean checkParameters(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() < 20 && login.trim().isEmpty()) {
                System.out.println(login);
            } else {
                throw new WrongLoginException("wrong login");
            }
            if (password.length() < 20 && password.matches("0-9") && password.equals(confirmPassword)) {
                System.out.println(password);
                System.out.println(confirmPassword);
            } else {
                throw new WrongPasswordException("wrong password");
            }
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}


