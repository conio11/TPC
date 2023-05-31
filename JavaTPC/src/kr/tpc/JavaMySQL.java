package kr.tpc;

public class JavaMySQL implements Dbconnect {
	// 인터페이스를 구현하는 클래스는 인터페이스에 정의된 모든 메소드를 구현해야 함 -> 하지 않을 시 컴파일 오류
	@Override
	public void getConnection(String url, String user, String password) {
		System.out.println("MySQL DB가 접속됩니다.");
	}
}