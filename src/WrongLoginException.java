public class WrongLoginException extends Exception {
    private String exeptionMessage;

    public WrongLoginException() {
    }

    public WrongLoginException(String exeptionMessage) {
        this.exeptionMessage = exeptionMessage;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "exeptionMessage='" + exeptionMessage + '\'' +
                '}';
    }
}
