package kr.kh.spring3.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.kh.spring3.model.dto.MessageDTO;
import kr.kh.spring3.model.vo.CommunityVO;
import kr.kh.spring3.model.vo.MemberVO;
import kr.kh.spring3.model.vo.PostVO;
import kr.kh.spring3.pagination.PageMaker;
import kr.kh.spring3.pagination.PostCriteria;
import kr.kh.spring3.service.MemberService;
import kr.kh.spring3.service.PostService;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	PostService postService;
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home (Model model) {
		log.info("/ : 메인 페이지입니다.");
		model.addAttribute("title", "메인");
		
		return "/main/home";
	
	}
	
	@GetMapping("/guest/signup")
	public String guestSignup() {
		log.info("/guest/signup:get");
		return "/member/signup";
	}
	
	@PostMapping("/guest/signup")
	public String signupPost(Model model, MemberVO member) {
		log.info("/guest/signup:post");
		boolean res = memberService.signup(member);
		MessageDTO message;
		if(res) {
			message = new MessageDTO("/", "회원가입에 성공했습니다.");
		} else {
			message = new MessageDTO("/guest/signup", "아이디나 이메일이 중복되었습니다.");
		}
		model.addAttribute("message", message);
		
		return "/main/message";
	}
	
	@GetMapping("/guest/login")
	public String guestLogin() {
		log.info("/guest/login:get");
		return "/member/login";
	}
	
	@PostMapping("/guest/login")
	public String guestLoginPost(Model model, MemberVO member, HttpSession session) {
		log.info("/guest/login:post");
		MemberVO user = memberService.login(member);
		MessageDTO message;
		
		if(user != null) {
			message = new MessageDTO("/", "로그인 성공!");
			session.removeAttribute("id");
		} else {
			message = new MessageDTO("/guest/login", "로그인 실패!");
			session.setAttribute("id", member.getMe_id());
		}
		model.addAttribute("message", message);
		model.addAttribute("user", user);
		
		return "/main/message";
	}
	
	@GetMapping("/member/logout")
	public String guestLogout(Model model, HttpSession session) {
		MessageDTO message;
		
		session.removeAttribute("user");
		message = new MessageDTO("/", "로그아웃 성공!");
		
		model.addAttribute("message", message);
		return "/main/message";
	}
	@ResponseBody
	@GetMapping("/test")
	public String test() {
		return "Hello";
	}
	@ResponseBody
	@GetMapping("/test2")
	public List<CommunityVO> test2() {
		return postService.getCommunityList();
	}
}
