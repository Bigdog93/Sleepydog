package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "dizney";
		System.out.println("t1.name : " + t1.name);
		t2.name = "Lotte";
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name);
	}
}


class Toy {
	static String name;
	// static이 붙은 애들은 프로그램이 실행될때 메모리에 올라간다.
}