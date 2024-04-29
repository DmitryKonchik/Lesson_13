public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("Неверный логин");
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
