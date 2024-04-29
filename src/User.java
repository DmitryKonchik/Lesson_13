public class User {
    static boolean Validation(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            try {
                throw new WrongLoginException("Логин должен быть до 20 символов");
            } catch (WrongLoginException e) {
                System.out.println(e);
                return false;
            }
        }
        if (login.split(" ").length > 1) {
            try {
                throw new WrongLoginException("Логин должен быть без пробелов");
            } catch (WrongLoginException e) {
                System.out.println(e);
                return false;
            }
        }

        if (password.length() > 20) {
            try {
                throw new WrongPasswordException("Пароль должен быть до 20 символов");
            } catch (WrongPasswordException e) {
                System.out.println(e);
                return false;
            }
        }
        if (password.split(" ").length > 1) {
            try {
                throw new WrongPasswordException("Пароль должен быть без пробелов");
            } catch (WrongPasswordException e) {
                System.out.println(e);
                return false;
            }
        }
        if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException("Пароль не совпадает");
            } catch (WrongPasswordException e) {
                System.out.println(e);
                return false;
            }
        }
        return true;
    }
}
