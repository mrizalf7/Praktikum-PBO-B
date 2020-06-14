package inheritanceTest;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota = new Car (4,5,false);
		Bike bmx = new Bike(2,"mountain");
		Convertible bmw = new Convertible(4,2,false,"Soft Top");
		Motorbike ninja = new Motorbike(2,"Sport");
		System.out.println(
		"Number of Doors on Toyota's Car : "+Toyota.getNumDoors());
		System.out.println(
				
			"Number of Wheels on Toyota's Car: "+Toyota.getWheels());
		
		String eletric;
		eletric = Toyota.getIsElectric() ?"yes":"no";
		System.out.println(
				"Is the toyota's car eletric?"+eletric);
		
		System.out.println("Number of Wheels on BMX's bike: "+bmx.getWheels());
		System.out.println("BMX bike's type: "+bmx.getBikeType());
		System.out.println("Numbers of Doors on BMW's Car: "+bmw.getNumDoors());
		System.out.println("Numbers of Wheels on BMW's Car: "+bmw.getWheels());
		System.out.println("BMW car roof's type: "+bmw.getRoofType());
		String electric = bmw.getIsElectric()?"yes":"no";
		System.out.println("Is the BMW's car electric? "+electric);
		System.out.println("Number of Wheels on Ninja's motorbike: "+ninja.getWheels());
		System.out.println("Ninja motorbike's type: "+ninja.getBikeType());
	}

}
