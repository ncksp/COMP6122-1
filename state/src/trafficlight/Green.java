package trafficlight;

public class Green extends TrafficLightState {
	@Override
	protected String getColor() {
		return "green light";
	}

	@Override
	public TrafficLightState next() {
		return new Yellow(this);
	}
}