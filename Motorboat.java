public class Motorboat extends Vehicle {
	private boolean inWater = false;
	
	public Motorboat(String regnr, String mark, String model){
		super(regnr, mark, model);
		System.out.println("Loodi mootorpaat: "+this);
	}
	
	public boolean isInWater() {
		return inWater;
	}
	
	public void pushToWater() {
		if(this.inWater) {
			System.out.println(this+"| on juba meres.");
			return;
		}
		inWater = true;
		System.out.println(this+" lükati merre");
	}
	public void driveToShore() {
		if(!this.inWater) {
			System.out.println(this+"| on juba kaldal.");	
			return;
		}
		if(this.fuel < 5) {
			System.out.println(this+"| ei oma piisavalt kütust, et kaldale sõita.");
			return;
		}
		inWater = false;
		System.out.println(this+" sõitis kaldale kaldale");
		this.fuel -= 5;
	}
	
	@Override
	public double getLuggageCapacity() {
		return 200.0;
	}
}