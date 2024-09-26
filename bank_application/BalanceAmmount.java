package bank_application;

public class BalanceAmmount {
	public void balanceamount(double aa,double ua) throws InsufficientFundsException{
		if(aa<ua) {
			throw new InsufficientFundsException("withdrawal amount is greater than the account balance");
		}
	}
}
