package sec06.ch06;

public class InstanceExam2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Dog dog2 = dog;
		
		dog.name = "뽀삐";
		dog2.name = "돌쇠";
		
		dog.bark();
		dog2.bark();
	}
}
