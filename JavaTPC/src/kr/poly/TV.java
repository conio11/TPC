package kr.poly;

public class TV implements RemoCon {
	@Override
	public void chUp() {
		System.out.println("TV 채널 올림");
	}

	@Override
	public void chDown() {
		System.out.println("TV 채널 올림");
	}

	@Override
	public void internet() {
		System.out.println("인터넷 연결 가능");
	}
	// + 추가 기능 구현 가능
}
