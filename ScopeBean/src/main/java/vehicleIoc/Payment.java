package vehicleIoc;

public class Payment 
{
	private String message;
	
	private PaymentStatus payStatus;
	
	public PaymentStatus getPayStatus() {
		return payStatus;
	}




	public void setPayStatus(PaymentStatus payStatus) {
		this.payStatus = payStatus;
	}




	public Payment(String type)
	{
		System.out.println("inside Payment constructor");
		
		System.out.println("Type of payment"+type);
	}
	
	
	

	@Override
	public String toString() {
		return "Payment [message=" + "Hello from payment message" + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
