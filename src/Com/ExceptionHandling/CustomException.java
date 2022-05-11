package Com.ExceptionHandling;

import javax.management.RuntimeErrorException;

public class CustomException extends RuntimeException {
	private String msg = "Your card is Blocked. Please visit nearest Branch";
	
	@Override
	public String getMessage() {
		return msg;
	}
	
	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
	@Override
	public String toString() {
		
		String strings = new CustomException().getMessage();
		return strings;
	}

}
