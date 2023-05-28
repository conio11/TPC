import kr.poly.*;

public class TPC25 {
	public static void main(String[] args) {
		// eat() --> 재정의(override) --> eat()
		// Animal a = new Animal(); --> 객체 생성 불가 (추상 클래스)
		// 부모 역할로 사용 -> 명령을 내리는 쪽
		Animal ani = new Dog();
		ani.eat(); // 다형성 보장된 상태 -> 부모(Animal)의 eat()를 Dog에서 재정의		
		ani.move();
		
		ani = new Cat();
		ani.eat(); // Cat의 eat() 출력
		ani.move();
		((Cat)ani).night(); // (Cat)으로 downcasting 해야 사용 가능
	}
}