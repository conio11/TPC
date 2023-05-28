package kr.poly;

public class Radio implements RemoCon {
	@Override
	public void chUp() {
		System.out.println("Radio 채널 올림");
	}

	@Override
	public void chDown() {
		System.out.println("Radio 채널 내림");
	}

	@Override
	public void internet() {
		System.out.println("인터넷 연결 불가");
	}

}
