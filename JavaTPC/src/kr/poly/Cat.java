package kr.poly;

public class Cat extends Animal {
	public void night() {
		System.out.println("밤에 눈에서 빛이 난다.");
	}
	
	// 우클릭 - source - override/implement methods..
	@Override
	public void eat() {
		// super.eat();
		System.out.println("고양이처럼 먹는다.");
	}
}