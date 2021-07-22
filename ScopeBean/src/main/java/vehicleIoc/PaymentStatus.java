package vehicleIoc;

public class PaymentStatus 
{
	private String status;

	public String getStatus() {
		return status;
	}

	public PaymentStatus() {
		System.out.println("Constructor of Payment Status");
		
		
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
