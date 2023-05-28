package kr.poly;
public interface RemoCon { // 객체 생성 불가 -> Remocon r = new RemoCon();
	// 인터페이스: 상수 또는 추상 메소드만 사용 가능 
	int MAXCH = 100; // RemoCon.MAXCH // (public static final) 생략
	int MINCH = 1; // RemoCon.MINCH // (public static final) 생략
	
	// 추상 메소드
	public void chUp();
	public void chDown();
	public void internet();
}