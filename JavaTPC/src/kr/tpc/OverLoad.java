package kr.tpc;

public class OverLoad {
	// 메소드 오버로딩: 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유영과 개수가 다르도록 하는 기술
	// -> 메소드의 signature(타입, 유형)가 다르면 된다 
	// 동작(method)으로만 이루어진 객체
	public void hap(int a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, int b) {
		System.out.println(a + b);
	}
	
	public void hap(float a, float b) {
		System.out.println(a + b);
	}
}
