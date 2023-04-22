package kr.tpc;

public class Dog extends Animal {
	// 이름, 나이, 종 : 상태 정보
	// 행위 정보(상속)
	
	// 부모 클래스의 메소드 재정의 -> override
	public void eat() {
		System.out.println("개처럼 먹는다.");
	}
}
