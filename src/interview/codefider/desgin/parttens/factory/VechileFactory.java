package interview.codefider.desgin.parttens.factory;

public class VechileFactory {
	
	public static Vechile getInstance(String type,int wheel) {
		if(type=="car") {
			return new Car(wheel);
		}else if(type=="bike") {
			return new Bike(wheel);
		}
		return null;
	}

}
