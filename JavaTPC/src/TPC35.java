public class TPC35 {
	public static void main(String[] args) {
		// 다른 메모리 공간에 생성 -> 다른 번지를 가리킴
		String str1 = new String("APPLE"); 
		String str2 = new String("APPLE");
		
		if (str1 == str2) { // 메모리 공간 비교
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if (str1.equals(str2)) { // 문자열값 비교
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		// 같은 메모리 공간에 생성
		String str3 = "APPLE";
		String str4 = "APPLE";
		
		if (str3 == str4) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}