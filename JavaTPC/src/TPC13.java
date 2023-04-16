import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {
		// 책 -> class(Book DTO) -> 객체 -> 인스턴스
		String title = "스프링";
		int price = 25000;
		String company = "제이펍";
		int page = 890;	
		// 개별적인 변수이므로 이 변수들을 책이라고 볼 수는 없음
		// 이 4개의 변수들을 동시에 옮기려면? 1) 배열(자료형 다르므로 사용 불가), 2) 직접 설계(클래스 -> BookDTO, BookVO 등)
		
		BookDTO dto; // dto (Object: 객체)
		dto = new BookDTO(title, price, company, page); // dto (Instance: 인스턴스)
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title + "\t");
		System.out.print(dto.price + "\t");
		System.out.print(dto.company + "\t");
		System.out.println(dto.page + "\t");	
	}
}
