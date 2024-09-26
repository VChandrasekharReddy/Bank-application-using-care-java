package bank_application;

public class UserAccount {
	public void getuser(boolean b) throws CustomerAccountNotFoundException{
		if(!b) {
			throw new CustomerAccountNotFoundException(" no account is found with the provided User id and User password ");
		}
	}

}
