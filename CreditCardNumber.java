
public class CreditCardNumber {

	private long creditCardNumber;

	public CreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public long getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(long creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	@Override
	public String toString() {
		return "CreditCardNumber [creditCardNumber=" + creditCardNumber + "]";
	}

}
