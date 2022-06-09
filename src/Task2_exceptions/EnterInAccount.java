package Task2_exceptions;

import java.util.Scanner;

public class EnterInAccount {
    String login ;
    String password ;
    String confirmPassword ;

    public EnterInAccount(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static boolean parameters(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() < 20 && login.trim().isEmpty()) {
                System.out.println(login);
                return true;
            }

        } catch (Exception e) {
            throw new WrongLoginException(e);
        }
        try {
            if (password.length() < 20 && password.matches("0-9") && password.equals(confirmPassword)) {
                System.out.println(password);
                System.out.println(confirmPassword);
                return true;
            }
        } catch (Exception e) {
            throw new WrongPasswordException(e);
        }
        return false;
    }
}


