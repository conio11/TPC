public class TPC09 {
	public static void main(String[] args) {
		int a = 56;
		int b = 40;
		// a + b = ?
		// int v = sum(a, b); // static 메소드 아니기 때문에 호출 불가
		TPC09 tpc = new TPC09(); // 객체 heap 영역에 생성
		int v = tpc.sum(a, b);
		System.out.println(v);
	}
	
	public int sum(int a, int b) {
		int v = a + b;
		return v;
	}
}
