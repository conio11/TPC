package kr.inflearn;
// 기본 default
public class MyClass { 
	public int sum(int a, int b) {
		int hap = 0;
		for (int i = a; i <= b; i++) {
			hap += i;
		}
		return hap;
	}
}
