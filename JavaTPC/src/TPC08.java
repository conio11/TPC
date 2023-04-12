public class TPC08 {
	public static void main(String[] args) {
		int a = 30;
		int b = 50;
		int v = add(a, b); // static method call
		System.out.println(v); 
	}
	
	public static int add(int a, int b) { // static 키워드 없으면 메소드가 메모리에 올라가지 않아 호출 불가
		int sum = a + b;
		return sum;
	}
}
