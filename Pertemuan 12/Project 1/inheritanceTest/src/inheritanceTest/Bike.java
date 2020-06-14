package inheritanceTest;

public class Bike extends Vehicle {
	//mountain bike,road bike,recumbent bike ..etc
	private String bikeType;
	
	public Bike(int numWheels,String bikeType) {
		super(numWheels);
		this.bikeType=bikeType;
	}
	public String getBikeType() {
		return bikeType;
	}
}
