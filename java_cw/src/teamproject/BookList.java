package teamproject;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookList {
	private String movieName;
	private String theater;
	private String Date;
	
	@Override
	public String toString() {
		return "제목 : " + movieName + ", 상영관 : " + theater + ", 날짜 : " + Date;
	}
	
}
