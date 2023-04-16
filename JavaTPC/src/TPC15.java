import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("홍길동", 40, "010-1234-5678", "서울");
		// setter method - X
		
		System.out.println(m.toString()); // 디버깅 용이
		
		MemberVO m1 = new MemberVO();
		m1.setName("나길동");
		m1.setAge(34);
		m1.setTel("010-2222-2222");
		m1.setAddr("광주");
		
		System.out.print(m1.getName() + "\t");
		System.out.print(m1.getAge() + "\t");
		System.out.print(m1.getTel() + "\t");
		System.out.println(m1.getAddr() + "\t");
		
		// System.out.println(m1.toString());
		System.out.println(m1); // toString() 생략
	}
}
