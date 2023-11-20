public class WrongPasswordException extends Exception {
    private String exeptionMessage;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String exeptionMessage) {
        this.exeptionMessage = exeptionMessage;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "exeptionMessage='" + exeptionMessage + '\'' +
                '}';
    }
}
