package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home() {
//		ViewResolver
//		prefix		->		/WEB-INF/jsp/
//		suffix		->		.jsp
//		그 사이에 있는 home만 쓰면		->		/WEB-INF/jsp/home.jsp 와 같음
		return "home";
	}
}
