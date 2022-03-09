package com.example.demo.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

public class CalcController {
	
		@RequestMapping("/add")
		public String demo(HttpServletRequest req)
		{
			HttpSession session=req.getSession();
			String input1=req.getParameter("value1");
			String input2=req.getParameter("value2");
			String res=input1+input2;
			session.setAttribute("value",value1);
			session.setAttribute("value",value2);
			return "calc.jsp";
		}
		
	}

}
