package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		Car mycar = new Car();
		Car yourcar = new Car();
		
		Car mycar2 = mycar;
		
		System.out.println(mycar2.equals(mycar)); // true
		System.out.println(mycar2 == mycar); // true
		System.out.println(mycar == yourcar); // false
		
		
		mycar.name = "소나타";
		mycar.cc = 2000;
		yourcar.name = "911";
		yourcar.cc = 5000;
		
		mycar.drive();
		mycar.stop();
		
		yourcar.drive();
		yourcar.stop();
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n", name);
	}
	
	void stop() {
		System.out.printf("%s는 멈춘다.\n", name);
	}
}