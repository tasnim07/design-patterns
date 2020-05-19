public class MySingleton {
	private static MySingleton uniqueInstance;

	private MySingleton() {}

	public static MySingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new MySingleton();
		}
		return uniqueInstance;
	}

	public void print_name() {
		System.out.println("Hello Singleton");
	}
}
