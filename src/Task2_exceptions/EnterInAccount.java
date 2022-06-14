package Task2_exceptions;

import java.util.Scanner;

public class EnterInAccount {
    public static boolean checkParameters(String login, String password, String confirmPassword) {
        try {
            if (login.length() < 20 && !login.contains(" ")) {
                System.out.println(login);
            } else {
                throw new WrongLoginException("wrong login");
            }
            if (password.length() < 20 && password.matches("\\p{Alnum}*") && password.equals(confirmPassword) && !password.contains(" ")) {
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


