import java.util.*;
public class FuelConsumption {
	static double calculate(Vehicle[] vehicles){
		double totalFuelConsumed = 0;
		for(Vehicle v:vehicles){
			totalFuelConsumed += calcConsumption(v);
		}
		return totalFuelConsumed;
	}
	static double calcConsumption(Vehicle vehicle){
		return vehicle.getFuelMaxCapacity() - vehicle.getCurrentFuel();
	}
}