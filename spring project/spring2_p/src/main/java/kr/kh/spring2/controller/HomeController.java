package kr.kh.spring2.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.kh.spring2.model.vo.MemberVO;
import kr.kh.spring2.service.MemberService;


@Controller
public class HomeController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		return "/main/home";
	}
	
	@GetMapping(value = "/signup")
	public String signup(Model model) {
		return "/member/signup";
	}
	@PostMapping(value ="/signup")
	public String signupPost(Model model, MemberVO member) {
		if(memberService.signup(member)) {
			model.addAttribute("url", "/");
			model.addAttribute("msg", "회원가입에 성공했습니다.");
		}else {
			model.addAttribute("url", "/signup");
			model.addAttribute("msg", "회원가입에 실패했습니다.");
		}
		
		return "/main/message";
	}

	
	@GetMapping(value ="/login")
	public String login(Model model) {
		return "/member/login";
	}
	@PostMapping(value ="/login")
	public String loginPost(Model model, MemberVO member, HttpSession session) {
		MemberVO user = memberService.login(member);
		session.setAttribute("user", user);
		if(user != null) {
			model.addAttribute("msg","로그인을 성공했습니다.");
			model.addAttribute("url","/");
		}else {
			model.addAttribute("msg","로그인을 실패했습니다.");
			model.addAttribute("url","/");
		}
		
		return "/main/message";
	}
}