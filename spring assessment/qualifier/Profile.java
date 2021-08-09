package vehicleScope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	   @Autowired
	   @Qualifier("student1")
	   private Student student;

	   public Profile(){
	      System.out.println("Inside Profile constructor." );
	   }
	   public void printId() {
	      System.out.println("id : " + student.getId() );
	   }
	   public void printName() {
	      System.out.println("Name : " + student.getName() );
	   }
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	   
	}



	