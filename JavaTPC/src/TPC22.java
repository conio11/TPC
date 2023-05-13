import kr.tpc.*;

public class TPC22 {
	public static void main(String[] args) {
		// Cat ani = new Cat();
		// Object ani = new Cat();
		Animal ani = new Cat(); // upcasting
		ani.eat(); // 컴파일 시점 -> Animanl의 eat() / 실행 시점 -> Cat의 eat()
		
		// ani.night(); 부모 타입으로 객체를 생성했기 때문에 사용 불가
		// Cat c = (Cat) ani; 형변환(downcasting)
		// c.night(); 실행 가능
		// (Cat) ani.night(); // . 연산자의 우선 순위가 () 보다 높기 때문에 에러
		((Cat) ani).night();
		
		ani = new Dog();
		ani.eat();
		
		// 다형성
		// 상위 클래스가 여러 하위 클래스에게 동일한 메시지로 서로 다르게 동작시키는 원리 
		
		Object o = new Dog();
		// o.eat(); Object가 가진 메소드가 아니므로 실행 불가
		((Dog) o).eat();
	}
}