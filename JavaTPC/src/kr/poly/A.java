package kr.poly;
import java.lang.*; // 생략 가능

public class A extends Object { // 기본적으로 Object 상속을 나타내는 extends는 생략
	public A() { // 생략 가능한 디폴트 생성자
		super();
	}
	
	public void display() {
		System.out.println("나는 A이다.");
	}
	
	/*
	 * // toString()
	 * 
	 * @Override public String toString() { return "재정의 메소드입니다."; }
	 */
}
