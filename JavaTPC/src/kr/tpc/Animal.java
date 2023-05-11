package kr.tpc;

public class Animal extends Object { // Object: 루트 클래스(최상위 클래스)
	public void eat() {
		System.out.println("?"); // 포괄적, 추상적
	}
	public Animal() {
		super(); // new Object();
	}
}