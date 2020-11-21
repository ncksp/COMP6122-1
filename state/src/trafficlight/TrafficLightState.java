package trafficlight;

public abstract class TrafficLightState {
	protected abstract String getColor();

	public abstract TrafficLightState next();

	public void print() {
		System.out.println(getColor());
	}
}