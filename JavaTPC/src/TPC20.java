import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {
		// Animal 부모 클래스를 사용하지 않음 -> 상속의 이점 사용 X
		Dog d = new Dog();
		d.eat(); // ? -> 개처럼 먹는다. (override)
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class
		// 자식(하위) 클래스의 동작 방식을 몰라도 제공되는 부모(상위) 클래스를 통해 Dog, Cat 구동 가능
		// 부모 = 자식 -> 자동 형변환 (upcasting)
		Animal ani = new Dog();
		ani.eat(); // '?' 아닌 '개처럼 먹는다.' 출력
		
		ani = new Cat();
		ani.eat(); // '?' 아닌 '고양이처럼 먹는다.' 출력
		// ani.night(); // Animal 클래스에 없는 메소드, 사용 불가
		((Cat) ani).night(); // 밤에 눈에서 빛이 난다. -> (강제 형변환)
	}
}
