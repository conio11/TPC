package kr.poly;

public class Dog extends Animal {
	// 이름, 나이, 종 : 상태 정보
	// 재정의(override)
	
	public Dog() { // 생략
		super(); // new Animal();
	}
	
	@Override
	// 부모가 추상 클래스이기 때문에 추상 메소드를 재정의하지 않으면 오류 
	public void eat() {
		System.out.println("개처럼 먹는다.");
	}
}