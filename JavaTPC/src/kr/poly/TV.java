package kr.poly;

public class TV implements RemoCon {
	int currCH = 70;
	@Override
	public void chUp() {
		if (currCH < RemoCon.MAXCH) { 
			currCH++;
			System.out.println("TV 채널 올림 : " + currCH);
		} else {
			currCH = 1;
		}
	}

	@Override
	public void chDown() {
		if (currCH > RemoCon.MINCH) {
			currCH--;
			System.out.println("TV 채널 내림 : " + currCH);
		} else {
			currCH = 100;
		}
	}

	@Override
	public void internet() {
		System.out.println("인터넷 연결 가능");
	}
	// + 추가 기능 구현 가능
}