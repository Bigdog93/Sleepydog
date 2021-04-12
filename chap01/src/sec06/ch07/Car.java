package sec06.ch07;

public class Car {
	void hoot() {
		System.out.println("빵 빵");
	}
}

class Bus extends Car {
	void openDoor() {
		System.out.println("문을 여시옹");
	}
	@Override
	void hoot() {
		System.out.println("Bus Bang!");
	}
}

class LocalBus extends Bus {
	@Override
	void hoot() {
		System.out.println("LocalBus Bang!");
	}
	@Override
	void openDoor() {
		System.out.println("LocalBus 문을 여시옹");
	}
}

class Truck extends Car {
	@Override
	void hoot() {
		System.out.println("Truck Bang!");
	}
}