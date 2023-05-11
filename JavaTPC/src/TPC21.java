import kr.tpc.*;
public class TPC21 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.class, Cat.class 파일 내용을 모르는 경우 -> 부모 클래스 사용
		// upcasting
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		// ani.night(); 부모에게 없는 메소드 사용 불가
		Cat cc = (Cat) ani; // downcasting
		cc.night();
		// ((Cat) ani).night();
		
		// 다형성 원리 - 상위 클래스가 여러 하위 클래스에게 동일한 메시지 보냄 -> 여러 하위 클래스에서 각각 다르게 동작
	}
}
