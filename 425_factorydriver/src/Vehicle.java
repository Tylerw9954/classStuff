
public abstract class Vehicle {
	private Driver driv;
protected Vehicle() {
	driv = getNewDriver();
}

public abstract Driver getNewDriver();
}
