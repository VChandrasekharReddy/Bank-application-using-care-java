package bank_application;

public class CustomerAccountNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomerAccountNotFoundException(String msg) {
		super(msg);
	}

}
