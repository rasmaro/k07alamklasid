public abstract class Vehicle {
	String regnr = "";
	String mark = "";
	String model = "";
	Double fuel = 50.0;
	Double fuelMaxCapacity = 50.0;
	
	public Vehicle(String regnr, String mark, String model){
		this.regnr=regnr;
		this.mark=mark;
		this.model=model;
	}
	
	public Double getCurrentFuel() {
		return fuel;
	}
	public Double getFuelMaxCapacity() {
		return fuelMaxCapacity;
	}
	
    public String toString() {
        return "Reg. märk: "+this.regnr+" Mark: "+this.mark+" Mudel: "+this.model;
    }
	
	abstract double getLuggageCapacity();
	
	
}