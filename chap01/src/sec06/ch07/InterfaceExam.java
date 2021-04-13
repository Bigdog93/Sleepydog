package sec06.ch07;
/*
인터페이스
	-변수라는 개념이 없다. 상수만 저장할 수 있음(public final static 다 붙는다.)
	-메소드는 추상메소드(선언부만 있는)만 쓸 수 있다.
	-변수 메소드 둘다 선언'만' 할수있다.
	
	<추상클래스> 			vs 			<인터페이스>
	
				객체화 불가능
				부모타입 역할
		자식한테 추상메소드 오버라이딩 강제성 부여
	
	다중상속 X						다중상속 O
	변수, 상수 가질 수 있음			상수만 가질 수 있음
	구현부 있는 메소드가질 수 있음		구현부 있는 메소드 가질 수 없음
	추상메소드 가질 수 있음			(추상메소드'만' 가질 수 있음)
*/
public class InterfaceExam {
	public static void main(String[] args) {
		LGTv tv1 = new LGTv();
		RemoteControl rc = tv1;
		RemoteControl rc2 = new SamsungTv();
		
		rc.volumeUp();
		rc.chkVolume();
		tv1.volumeUp();
		rc.chkVolume(); // tv1 과 rc 어차피 같은 인스턴스
		
		rc2.volumeUp();
		rc2.chkVolume();
	}
}
