package interview.codefider.desgin.parttens.builder;

public class VechileBuilderMain {

	public static void main(String[] args) {
		
		Vechicle car=new Vechicle.VechileBuilder("1500CC", 4).setAirbags(4).setSeats("5").build();
		Vechicle bike=new Vechicle.VechileBuilder("150CC", 2).setSeats("2").build();
		
		System.out.println(car);
		System.out.println(bike);

	}

}
