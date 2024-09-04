package kr.kh.spring3.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MessageDTO {
	
	String url;
	String msg;
	
	public MessageDTO(String string, String string2) {
		
	}
}
