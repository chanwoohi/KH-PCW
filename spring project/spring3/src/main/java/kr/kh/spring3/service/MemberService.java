package kr.kh.spring3.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.spring3.dao.MemberDAO;
import kr.kh.spring3.model.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public boolean signup(MemberVO member) {
		if(member == null) {
			return false;
		}
		
		if(!regexCheckMember(member)) {
			return false;
		}
		
		//비밀번호 암호화
		String encPw = passwordEncoder.encode(member.getMe_pw());
		
		//암호화된 비번으로 회원 정보를 수정
		member.setMe_pw(encPw);
		
		
		try {
			return memberDao.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	private boolean regexCheckMember(MemberVO member) {
		if(member == null || member.getMe_pw() == null || member.getMe_id() == null) 
			return false;
		if(!Pattern.matches("^\\w{6,13}$", member.getMe_id()))
			return false;
		if(!Pattern.matches("^[a-zA-Z0-9!@#$]{6,15}$", member.getMe_pw()))
			return false;
		
		return true;
	}
}
