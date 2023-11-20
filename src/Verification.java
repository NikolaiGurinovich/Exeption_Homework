public class Verification {
    private static String longLogin = "login is too long";
    private static String loginHasSpace = "login should't contain space";
    private static String shortPasssword = "password is too long";
    private static String passwordHasSpace = "password should't contain space";
    private static String passwordNasNotNumbers = "password is't contain number";
    private static String confirmPasswordError = "confirm password isn't matches";



    public static boolean logIn (String password, String login, String confirmPassword){
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException(longLogin);
            }
            if (login.contains(" ")){
                throw new WrongLoginException(loginHasSpace);
            }
            if (password.length() >= 20) {
                throw new WrongPasswordException(shortPasssword);
            }
            if (password.contains(" ")) {
                throw new WrongPasswordException(passwordHasSpace);
            }
            if (!password.replaceAll("[0-9]", " ").contains(" ")) {
                throw new WrongPasswordException(passwordNasNotNumbers);
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException(confirmPasswordError);
            }
            return true;
        }
        catch (WrongLoginException | WrongPasswordException e  ) {
            System.out.println(e);
        }
        return false;
    }
}
