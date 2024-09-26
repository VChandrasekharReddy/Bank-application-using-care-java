package bank_application;

class PasswordValidator {

    public void validatePassword(String password) throws InvalidPasswordFormatException {
        if (password.length() < 8 || !password.contains("*")) {
            throw new InvalidPasswordFormatException("Password must be at least 8 characters long and contain an asterisk (*).");
        }
    }
}

