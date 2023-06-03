public class TPC34 {
	public static void main(String[] args) {
		// String
		java.lang.String str = new java.lang.String("APPLE"); // java.lang은 디폴트값이므로 생략 가능
		System.out.println(str);
		
		String v = str.toLowerCase();
		System.out.println(v); // apple
		System.out.println(str.charAt(3)); // 문자열 3번째 인덱스값 반환
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX")); // 없는 문자열 -> -1
		System.out.println(str.replaceAll("P", "X"));
	}
}