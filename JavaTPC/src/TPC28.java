import kr.poly.A;

public class TPC28 {
	public static void main(String[] args) {
		A a = new A();
		a.display();
		// System.out.println(a.toString());
		System.out.println(a); // A.java에서 toString() 제거 시 번지로 출력 -> Object 클래스의 toString() 메소드 실행
		
		Object o = new A(); // upcasting
		((A)o).display(); // a.display(); 와 같은 결과
		System.out.println(o.toString());
	}
}