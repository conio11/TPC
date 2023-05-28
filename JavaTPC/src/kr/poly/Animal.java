package kr.poly;

public abstract class Animal { // 추상 클래스 (불완전한 객체 -> 스스로 동작할 수 없음) // Animal ani = new Animal(); 객체 생성 불가
	// 스스로 객체 생성은 불가능하나 부모의 역할은 수행 가능
	// Dog, Cat --> eat()
	public abstract void eat(); // 추상 메소드 (불완전한 메소드)
	public void move() { // 구현 메소드
		System.out.println("무리를 지어서 이동한다.");
	}
} 