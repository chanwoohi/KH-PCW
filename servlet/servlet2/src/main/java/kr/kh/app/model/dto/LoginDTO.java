package kr.kh.app.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDTO {
	
	private String id;
	private String pw;
	private String email;
}
