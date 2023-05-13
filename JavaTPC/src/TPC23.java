import kr.tpc.*;

public class TPC23 {
	public static void main(String[] args) {
		// 1. 다형성 인수
		Dog d = new Dog();
		dispaly(d);
		Cat c = new Cat();
		dispaly(c);
	}

	private static void dispaly(Animal r) { // Dog(), Cat() 타입 모두 사용 가능 -> r: 다형성 인수
		r.eat();
		// r.night();
		if (r instanceof Cat) { // instance of: 왼쪽이 오른쪽의 인스턴스(부모 클래스) 인지
			((Cat)r).night(); // downcasting
		}
	}
}