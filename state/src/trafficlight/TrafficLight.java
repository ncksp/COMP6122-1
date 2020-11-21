package trafficlight;

public class TrafficLight {
	private TrafficLightState currentState;

	public TrafficLight() {
		currentState = new Red();
	}

	public void changeLight() {
		currentState = currentState.next();
	}

	public void printLight() {
		currentState.print();
	}
}