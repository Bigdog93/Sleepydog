package sec06.ch07;

public class AbstExam {
	public static void main(String[] args) {
//		Animal test = new Animal(); // 추상클래스는 new연산자로 인스턴스화 되지 않는다. 상속용으로만 쓰겠다.
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal hamster = new Hamster();
		
		dog.breath();
		
		cry(cat);
		
		cry(dog);
		
		cry(hamster);
		
	}
	
	static void cry(Animal ani) {
		if(ani instanceof Hamster) {
			((Hamster) ani).runRail();
		}else ani.howling();
	}
}
