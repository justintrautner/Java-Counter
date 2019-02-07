package com.justin.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		
		if(session.getAttribute("counter") != null) {
			session.setAttribute("counter", (int) session.getAttribute("counter")+1);
		}else {
			session.setAttribute("counter", 0);
		}
		return "home.jsp";
	}

	@RequestMapping("/counter")
	public String index() {
		
		return "counter.jsp";
	}
	
}
