package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	
	// 디폴트 생성자 메소드(생략)
	public BookDTO() {
		// 객체를 생성하는 작업 (기계어 코드)
		// 생성자 메소드에 의해 객체가 생성됨과 동시에 자기 자신을 가리키는 this 객체 생성
	}
	
	// 우클릭 - source - Generate Constructor using Fields: 필드를 이용한 생성자 자동 생성
	public BookDTO(String title, int price, String company, int page) {
		super();
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
	
	
}
