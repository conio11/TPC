package kr.tpc;
// 책 (Object) -> 제목, 가격, 출판사, 페이지 수, ...
public class BookVO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 생성자가 없으면 디폴트 생성자가 생성되나, 생성자가 만들어진 경우 디폴트 생성자 생성 X
	
	public BookVO() {
		// 초기화 작업
		// this. 생략 가능하나 사용하는 것이 좋음
		this.title = "자바";
		this.price = 14000;
		this.company = "이지스";
		this.page = 780;
	}
	
	// 생성자 메소드의 중복정의(overloading) -> 같은 메소드명, 다른 매개변수(개수, 타입 등)
	public BookVO(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;;
		this.company = company;
		this.page = page;
		
	}

}
