package kr.kh.spring3.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class MessageDTO {
	
	String url;
	String msg;
	
}