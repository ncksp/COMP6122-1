package trafficlight;

public class Red extends TrafficLightState {
	@Override
	protected String getColor() {
		return "red light";
	}

	@Override
	public TrafficLightState next() {
		return new Yellow(this);
	}
}