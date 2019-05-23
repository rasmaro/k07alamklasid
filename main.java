public class main{
	public static void main(String[] arg){
		System.out.println("");
		
		Car car = new Car("AAA-111", "BMW", "E39");
		Motorboat boat = new Motorboat("BBB-222", "Kalapaat", "1337");
		
		System.out.println("");
		
		System.out.println("Auto pagasi mahutavus: "+car.getLuggageCapacity());
		System.out.println("Paadi pagasi mahutavus: "+boat.getLuggageCapacity());
		
		System.out.println("");
		
		System.out.println("Auto poes: "+(car.isInShop() ? "Jah" : "Ei"));
		System.out.println("Paat vees: "+(boat.isInWater() ? "Jah" : "Ei"));
		
		System.out.println("");
		
		car.DriveToShop();
		boat.pushToWater();
		
		System.out.println("");
		
		System.out.println("Auto poes: "+(car.isInShop() ? "Jah" : "Ei"));
		System.out.println("Paat vees: "+(boat.isInWater() ? "Jah" : "Ei"));
		
		// objekti massiivi demo
		
		Vehicle[] vehicles = {car, boat, new Car("674-BCL", "Mitsubishi", "Colt"), new Car("E=MC^2", "Delorian", "MartyMcFly"), new Motorboat("BB1-53B", "Monte Carlo", "6S")};
		
		System.out.println("");
		System.out.println("Massiivi demo:");
		for(int i = 0; i < 11; i++) {
			for (Vehicle vehicle:vehicles) {
				if(vehicle instanceof Car){
					Car v = (Car)vehicle;
					if(v.isInShop()) {
						v.DriveToHome();
					} else {
						v.DriveToShop();
					}
				}
				else if(vehicle instanceof Motorboat){
					Motorboat v = (Motorboat)vehicle;
					if(v.isInWater()) {
						v.driveToShore();
					} else {
						v.pushToWater();
					}
				}
			}	
			System.out.println("");
		}
		
		System.out.println("Kütuse kulu kokku: "+FuelConsumption.calculate(vehicles));
	}
}

/*
 java main

Loodi auto: Reg. märk: AAA-111 Mark: BMW Mudel: E39
Loodi mootorpaat: Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337

Auto pagasi mahutavus: 450.0
Paadi pagasi mahutavus: 200.0

Auto poes: Ei
Paat vees: Ei

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis poodi.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre

Auto poes: Jah
Paat vees: Jah
Loodi auto: Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt
Loodi auto: Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly
Loodi mootorpaat: Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S

Massiivi demo:
Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis koju.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis poodi.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis poodi.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis poodi.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis koju.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis koju.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S sõitis kaldale kaldale

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis koju.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis poodi.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis poodi.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis poodi.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis koju.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis koju.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S sõitis kaldale kaldale

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis koju.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis poodi.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis poodi.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis poodi.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis koju.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis koju.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S sõitis kaldale kaldale

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis koju.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis poodi.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis poodi.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis poodi.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis koju.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis koju.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S sõitis kaldale kaldale

Reg. märk: AAA-111 Mark: BMW Mudel: E39 sõitis koju.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis poodi.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis poodi.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Reg. märk: AAA-111 Mark: BMW Mudel: E39| ei oma piisavalt kütust, et poodi sõita.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 lükati merre
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt sõitis koju.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly sõitis koju.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S sõitis kaldale kaldale

Reg. märk: AAA-111 Mark: BMW Mudel: E39| ei oma piisavalt kütust, et poodi sõita.
Reg. märk: BBB-222 Mark: Kalapaat Mudel: 1337 sõitis kaldale kaldale
Reg. märk: 674-BCL Mark: Mitsubishi Mudel: Colt| ei oma piisavalt kütust, et poodi sõita.
Reg. märk: E=MC^2 Mark: Delorian Mudel: MartyMcFly| ei oma piisavalt kütust, et poodi sõita.
Reg. märk: BB1-53B Mark: Monte Carlo Mudel: 6S lükati merre

Kütuse kulu kokku: 205.0

*/