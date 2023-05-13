import kr.tpc.*;

public class TPC24 {
	public static void main(String[] args) {
		// 2. 다형성 배열
		// Dog, Cat 타입을 저장할 배열 생성
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for (int i = 0; i < ani.length; i++) { 
			ani[i].eat();
			if (ani[i] instanceof Cat) { // instance of: 왼쪽이 오른쪽의 인스턴스(부모 클래스) 인지
				((Cat) ani[i]).night();
			}
		}
		display(ani);
	}

	private static void display(Animal[] ani) { 
		for (int i = 0; i < ani.length; i++) {
			ani[i].eat();
			if (ani[i] instanceof Cat) { // instance of: 왼쪽이 오른쪽의 인스턴스(부모 클래스) 인지
				((Cat) ani[i]).night();
			}
		}
	}
}