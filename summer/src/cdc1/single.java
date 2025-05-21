package cdc1;
class chocolate{
	void brand() {
		System.out.println("sweet ");
	}
}
class darkfantasy extends chocolate {
	void action() {
		System.out.println("investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("nani");
	}
}
class Heroine extends Hit{ 
	void look() {
		System.out.println("good");
	}
}

public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hero a1=new Hero ();
		 Heroine e1=new Heroine();
		 
		a1.action();
		a1.genre();
		a1.name();
		e1.look();
		
		

	}

}
