package main;

import trafficlight.TrafficLight;

public class Main {
	public Main() {
		TrafficLight light = new TrafficLight();

		for (int i = 0; i < 5; i++) {
			light.printLight();
			light.changeLight();
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
