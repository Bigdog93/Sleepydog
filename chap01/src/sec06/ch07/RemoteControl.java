package sec06.ch07;
/*
 인터페이스
 	-변수라는 개념이 없다. 상수만 저장할 수 있음(public final static 다 붙는다.)
 	-메소드는 추상메소드(선언부만 있는)만 쓸 수 있다.
 	-변수 메소드 둘다 선언'만' 할수있다.
 */
public interface RemoteControl {
	int sum = 10; // 그냥 이렇게 써도 public final static 다 붙는다.
	// public : 다른패키지에서 호출 가능
	// final : 값 변경 불가
	// static : 객체 생성 없이 인터페이스명으로 호출
	
	public abstract void volumeUp();
	void volumeDown(); // 이렇게만 적어도 앞에 public abstract가 붙는다.
	void chkVolume();
}
