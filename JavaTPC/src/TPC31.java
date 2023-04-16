import kr.tpc.Inflearn;

public class TPC31 {
	public static void main(String[] args) {
		// Inflearn inf = new Inflearn(); // 생성자를 private으로 설정하면 객체 생성 불가, 모든 멤버가 static인 경우
		// inf.tpc(); 
		Inflearn.tpc();
		
		// inf.java();
		Inflearn.java(); // java()는 static 메소드이므로 객체 없이 접근 가능
		
		// Java API 생성자 private
		// System sys = new System();
		System.out.println("출력");
		
		// Math m = new Math();
		int v = Math.max(10, 20);
		System.out.println(v);
	}
}
