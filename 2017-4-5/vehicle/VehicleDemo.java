class Vehicle {
	int passengers;
	int fuelcap;
	int mpg;

	int range() {
		return fuelcap * mpg;
	}

	double fuelneeded(double distance) {
		return distance / mpg;
	}

	Vehicle(int x, int y, int z) {
		passengers = x;
		fuelcap = y;
		mpg = z;

	}
}

class VehicleDemo {
	public static void main(String[] args) {
		String parameter = args[0];
		double distance = Double.parseDouble(parameter);

		Vehicle minivan = new Vehicle(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		Vehicle sportscar = new Vehicle(Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));


		// minivan.passengers = 7;
		// minivan.fuelcap = 16;
		// minivan.mpg = 21;

		// sportscar.passengers = 2;
		// sportscar.fuelcap = 14;
		// sportscar.mpg = 12;

		System.out.println("Minivan can carry " + minivan.passengers + " passengers. The range is " + minivan.range() + ".");


		System.out.println("Sportscar can carry " + sportscar.passengers + " passengers. The range is " + sportscar.range() + ".");

		System.out.println(minivan.fuelneeded(distance) + " gallons are needed to go " + distance + " miles in the MiniVan.");
	}
}