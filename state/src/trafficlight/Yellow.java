package trafficlight;

public class Yellow extends TrafficLightState {
	TrafficLightState source;

	public Yellow(TrafficLightState source) {
		this.source = source;
	}

	@Override
	protected String getColor() {
		return "yellow light";
	}

	@Override
	public TrafficLightState next() {
		if (source.getClass().equals(Red.class)) {
			return new Green();
		}

		return new Red();
	}
}