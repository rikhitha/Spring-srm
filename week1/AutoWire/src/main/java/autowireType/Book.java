package autowireType;

public class Book 
{
private String publisher;
	
	private BookStatus bstatus;
	
	public BookStatus getBookStat() {
		return bstatus;
	}




	public void setPayStat(BookStatus bstatus) {
		this.bstatus = bstatus;
	}




	public Book(String type)
	{
		System.out.println("inside Book constructor");
		
		System.out.println("Type of payment"+type);
	}
	
	
	

	@Override
	public String toString() {
		return "Payment [message=" + "Hello from payment message" + "]";
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


}
