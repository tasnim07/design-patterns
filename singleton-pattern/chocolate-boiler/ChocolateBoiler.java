public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	// private static ChocolateBoiler instance;
	// private static ChocolateBoiler instance = new ChocolateBoiler();
	private volatile static ChocolateBoiler instance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	// as synchronized is expensive, we can do away with lazy instantiation
	// we can move to eagerly created instance like it is getting created now.
	// public static synchronized ChocolateBoiler getInstance() {
	// 	if (instance == null) {
	// 		instance = new ChocolateBoiler();
	// 	}
	// 	return instance;
	// }

	// public static ChocolateBoiler getInstance() {
	// 	return instance;
	// }

	// this is third method, double-checked locking
	// first we will check if the instance is created and if not,
	// then synchronize. This way we will synchronize only for the first time.
	public static ChocolateBoiler getInstance() {
		if (instance == null) {
			synchronized (ChocolateBoiler.class) {
				if (instance == null) {
					instance = new ChocolateBoiler();
				}
			}
		}
		return instance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}

}
