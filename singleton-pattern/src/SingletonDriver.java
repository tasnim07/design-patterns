public class SingletonDriver {
	public static void main(String[] args) {
		MySingleton object1 = MySingleton.getInstance();
		object1.print_name();
	}
}