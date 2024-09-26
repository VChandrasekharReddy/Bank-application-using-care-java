package bank_application;

@SuppressWarnings("serial")
public class InvalidPasswordFormatException extends Exception{
	public InvalidPasswordFormatException(String msg) {
		super(msg);
	}

}
