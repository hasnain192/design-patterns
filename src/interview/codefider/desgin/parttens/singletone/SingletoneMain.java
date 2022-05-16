package interview.codefider.desgin.parttens.singletone;

public class SingletoneMain {

	public static void main(String[] args) {

		// --------------------SingletoneEgar--------------------------
		 SingletoneEgar igarInstance1=SingletoneEgar.getInstance();
		  
		  System.out.println("igarInstance1----->"+igarInstance1);
		  
		  SingletoneEgar igarInstance2=SingletoneEgar.getInstance();
		  
		  System.out.println("igarInstance2--------->"+igarInstance2);
		  
		 
		// -------------------------SingletoneLezy---------------------------------

		SingletoneLezy lezyInntance1 = SingletoneLezy.getInstance();
		System.out.println("lezyInntance1----: " + lezyInntance1);
		SingletoneLezy lezyInntance2 = SingletoneLezy.getInstance();
		System.out.println("lezyInntance2----: " + lezyInntance2);

		// Synchronized singleton

		SynchronizedSingleton synchInstane1 = SynchronizedSingleton.getInstance();
		System.out.println("synchInstane1----: " + synchInstane1);
		SynchronizedSingleton synchInstane2 = SynchronizedSingleton.getInstance();
		System.out.println("synchInstane2----: " + synchInstane2);

		// SynchronizedBlockSingleton

		SynchronizedBlockSingleton synchBlockInstane1 = SynchronizedBlockSingleton.getInstance();
		System.out.println("synchBlockInstane1----: " + synchBlockInstane1);
		SynchronizedBlockSingleton synchBlockInstane2 = SynchronizedBlockSingleton.getInstance();
		System.out.println("synchBlockInstane2----: " + synchBlockInstane2);

	}

}
