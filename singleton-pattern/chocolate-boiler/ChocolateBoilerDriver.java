
public class ChocolateBoilerDriver {
	
	

	public static void main(String[] args){
		ChocolateBoiler instance = ChocolateBoiler.getInstance();
		System.out.println("Boiler status: " + instance.isEmpty());
		instance.fill();
		// instance.boil();
		// instance.drain();

		ChocolateBoiler second_instance = ChocolateBoiler.getInstance();
		System.out.println("[2] Boiler status: " + instance.isEmpty());
		
	}	
}
