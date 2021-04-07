package sec06.ch06;

public class ConstructorExam {
	// 생성자()
	// 객체 지향 언어는 모두 생성자를 사용한다.
	// 생성자는 객체가 만들어질 때 무조건 호출한다.
	public static void main(String[] args) {
		Tv tv = new Tv();
		Tv tv2 = new Tv();
		Tv tv3 = new Tv("LG", 120, 300, 200);
		
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		
		tv.displayVolume(); // 현재 볼륨 : 3
		tv2.displayVolume();
		
		tv3.displayState();
	}
}


class Tv {
	String brand;
	int inch;
	int maxCh;
	int maxVo;
	int channel;
	int volume;
	
	//기본 생성자
	//생성자 vs 메소드
	//이름은 클래스명이랑 같다.
	//리턴타입이 없다.
	Tv() {}
	//기본 생성자는 컴파일러가 생성자가 하나도 없을시 알아서 넣어준다.
	// 생성자는 객체 생성할 때만 사용할 수 있다.
	Tv(String brand, int inch, int maxCh, int maxVo) {
		this.brand = brand;
		this.inch = inch;
		this.maxCh = maxCh;
		this.maxVo = maxVo;
	}
	
	void volumeUp() {
		System.out.println("현재 볼륨 : " + ++volume);
	}
	
	void displayVolume() {
		System.out.println("현재 볼륨 : " + volume);
	}
	
	void displayState() {
		System.out.printf("%s %dinch %dChannel %dVolume", brand, inch, maxCh, maxVo);
	}
}