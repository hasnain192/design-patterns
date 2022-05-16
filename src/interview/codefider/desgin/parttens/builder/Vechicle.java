package interview.codefider.desgin.parttens.builder;

public class Vechicle {
	
	// required fields
	private String engine;
	private int wheel;
	
	// optional fields
	 private int airbag;
	 private String seats;
	 
	 
		private Vechicle(VechileBuilder builder) {
			this.engine=builder.engine;
			this.wheel=builder.wheel;
			this.airbag=builder.airbag;
			this.seats=builder.seats;
		}
	 
	public String getEngine() {
		return engine;
	}
	public int getWheel() {
		return wheel;
	}
	public int getAirbag() {
		return airbag;
	}
	public String getSeats() {
		return seats;
	}
	 
	
	public static class VechileBuilder {

		private String engine;
		private int wheel;
		
		// optional fields
		 private int airbag;
		 private String seats;
		 
		 public VechileBuilder(String engine, int wheel) {
			 this.engine=engine;
			 this.wheel=wheel;
		 }
		 
		 public VechileBuilder setAirbags(int airbags) {
			 this.airbag=airbags;
			 return this;
		 }
		 public VechileBuilder setSeats(String seats) {
			 this.seats=seats;
			 return this;
			
		}
		 public Vechicle build() {
			 return new Vechicle(this);
		 }
	}


	@Override
	public String toString() {
		return "Vechicle [engine=" + engine + ", wheel=" + wheel + ", airbag=" + airbag + ", seats=" + seats + "]";
	}
	
	
	 

}
