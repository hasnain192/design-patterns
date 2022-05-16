package interview.codefider.desgin.parttens.factory;

public class Car extends Vechile{

	int wheel;
	Car(int wheel){
		this.wheel=wheel;
	}
	
	@Override
	public int getWheel() {
		
		return this.wheel;
	}

}
