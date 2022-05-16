package interview.codefider.desgin.parttens.factory;

public class FactoryMain {

	public static void main(String[] args) {
		
		Vechile car=VechileFactory.getInstance("car", 4);
		System.out.println(car);
		
		
		Vechile bike=VechileFactory.getInstance("bike", 2);
		System.out.println(bike);
		
		Vechile train=VechileFactory.getInstance("train", 1000);
		
		System.out.println(train);
		}

}
