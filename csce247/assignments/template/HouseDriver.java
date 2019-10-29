
package csce247.assignments.template;

public class HouseDriver {

	public static void main(String[] args) {
		System.out.println("**** Let's build houses ****");
		
		House[] homes = new House[3];
		
		homes[0] = new BrickHouse();
		homes[1] = new VinylHouse();
		homes[2] = new LogCabin();
		
		//loop through the houses and build them.
		for(int i=0; i < homes.length; i++) {
			homes[i].buildHouse();
			System.out.println();
		}
	}
}
