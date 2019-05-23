public class Car extends Vehicle {
	private boolean inShop = false;
	
	public Car(String regnr, String mark, String model){
		super(regnr, mark, model);
		System.out.println("Loodi auto: "+this);
	}
	public boolean isInShop() {
		return inShop;
	}
	
	public void DriveToShop() {
		if(this.inShop) {
			System.out.println(this+"| on juba poes.");	
			return;
		}
		if(this.fuel < 5) {
			System.out.println(this+"| ei oma piisavalt kütust, et poodi sõita.");	
			return;
		}
		
		inShop = true;
		System.out.println(this+" sõitis poodi.");	
		this.fuel -= 5;
	}
	public void DriveToHome() {
		if(!this.inShop) {
			System.out.println(this+"| on juba kodus.");	
			return;
		}
		if(this.fuel < 5) {
			System.out.println(this+"| ei oma piisavalt kütust, et koju sõita.");
			return;
		}
		
		inShop = false;
		System.out.println(this+" sõitis koju.");
		this.fuel -= 5;
	}
	
	@Override
	public double getLuggageCapacity() {
		return 450.0;
	}
}