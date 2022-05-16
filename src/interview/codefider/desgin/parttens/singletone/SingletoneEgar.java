package interview.codefider.desgin.parttens.singletone;

/*This is a singtone egar method */

public class SingletoneEgar {

	private static SingletoneEgar instance=new SingletoneEgar();
	
	private SingletoneEgar() {}
	
	public static SingletoneEgar getInstance() {
		return instance;
	}
	
}
