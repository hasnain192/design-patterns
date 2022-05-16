package interview.codefider.desgin.parttens.singletone;

public class SingletoneLezy {
	
	private static SingletoneLezy instance;
	
	private SingletoneLezy() {}
	
	public static SingletoneLezy getInstance() {
		if(instance==null) {
		instance=new SingletoneLezy();
			
		}
		return instance;
	}

}
