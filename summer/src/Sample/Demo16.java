package Sample;

public class Demo16 {
	private String firstName;
	private String lastName;
	private String emailid;
	private long phonenumber;
	public void setFirstName(String fn) {
		firstName=fn;
	}
	public void setlastName(String ln) {
		lastName=ln;
	}
	public void setEmailid(String ed) {
		emailid=ed;
		
	}
	public void setPhonenumber(long ph) {
		phonenumber=ph;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;	
	}
	public String getEmailid() {
		return emailid;
	}
	public long getPhonenumber() {
		return phonenumber;
	}

	public static void main(String[] args) {
		Demo16 d1=new Demo16();
		d1.setFirstName("Khushi");
		d1.setlastName("shahi");
		d1.setEmailid("shahikhushi@gmail.com");
		d1.setPhonenumber(8341629370l);
		System.out.println(d1.getFirstName());
		System.out.println(d1.getLastName());
		System.out.println(d1.getEmailid());
		System.out.println(d1.getPhonenumber());
		

	}
 
}
