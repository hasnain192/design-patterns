package interview.codefider.desgin.parttens.factory;

public class Bike extends Vechile {

	int wheel;
	
	Bike(int wheel){
		this.wheel=wheel;
	}
	
	@Override
	public int getWheel() {
		
		return this.wheel;
	}

}
