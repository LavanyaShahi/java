package Sample;
class FixedAmount{
	public int fixedamount=10000;
}
abstract class Withdrawl{
	abstract void withdraw(int amount);
		
	}

public class Demo15 extends Withdrawl {
	FixedAmount f1= new FixedAmount();
	void withdraw(int amount) {
		f1.fixedamount -= amount;
		System.out.println("Withdrawn: "+ amount);
		System.out.println("Available Balance: " + f1.fixedamount);
		
	}
	
	public static void main(String[] args) {
		int amount = Integer.parseInt(args[0]);
		Demo15 d = new Demo15();
		d.withdraw(amount);

	}

}
