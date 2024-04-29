public class WrongPasswordException extends RuntimeException{

    public WrongPasswordException() {
        super("Неверный пароль");
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
