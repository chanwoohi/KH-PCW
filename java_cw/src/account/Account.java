package account;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
	//날짜, 수입, 지출
	private String date;
	private String income;
	private String expense;
	
	//수입 - 월급, 용돈, 부수입 
	private String salary;
	private String allowance;
	private String extraIncome;
	
	//지출 -
	
	//금액, 내용
	private int money;
	private String contents;
	
}
