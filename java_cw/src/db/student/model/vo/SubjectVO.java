package db.student.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor // 기본 생성자
public class SubjectVO{

	private String su_key;
	private int su_grade;
	private int su_semester;
	private int su_num;
	private String su_name;

}
