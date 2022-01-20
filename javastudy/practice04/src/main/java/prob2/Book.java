package prob2;

public class Book {
	private int bookNo;		//책 번호
	private String title;	// 책 제목
	private String author;	// 작가
	private int stateCode;	// 대여 유무 코드
	
	Book(int bookNo, String title, String author){
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//대여
	public void rent() {
		if(getStateCode()==1) {
			System.out.println(getTitle() + " 이(가) 대여 되었습니다.");
			setStateCode(0);
		}else {
			System.out.println(getTitle() + " 이(가) 이미 대여 중입니다.");
		}
	}
	
	//책 정보 출력
	public void bookShow() {
		String stock ="재고 있음";
		if(getStateCode()==0) {
			stock = "대여중";
		}
		System.out.printf("책 제목: %s, 작가: %s, 대여 유무: %s %n", getTitle(), getAuthor(), stock);
	}
}