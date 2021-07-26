package autowireType;

public class Vehicle 
{
	private String name;
	
	private PaymentStatus payStatus;
	
	public PaymentStatus getPayStatus() {
		return payStatus;
	}




	public void setPayStatus(PaymentStatus payStatus) {
		this.payStatus = payStatus;
	}




	public Vehicle(String type)
	{
		System.out.println("inside Vehicle constructor");
		
		System.out.println("Type of payment"+type);
	}
	
	
	

	@Override
	public String toString() {
		return "Payment [message=" + "Hello from payment message" + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
