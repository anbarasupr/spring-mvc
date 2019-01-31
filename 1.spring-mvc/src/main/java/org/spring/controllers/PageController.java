package org.spring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.spring.model.Login;
import org.spring.model.User;
import org.spring.service.UserService;

@Controller
@RequestMapping("page")
public class PageController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("----------PageController-login-----------");
		ModelAndView mav = new ModelAndView("auth/login");
		return mav;
	}
	
	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public ModelAndView auth(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("----------PageController-auth-----------");
		ModelAndView mav = new ModelAndView("auth/auth");
		return mav;
	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView admin(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("----------PageController-admin-----------");
		ModelAndView mav = new ModelAndView("admin/admin");
		return mav;
	}

	@RequestMapping(value = "/stud", method = RequestMethod.GET)
	public ModelAndView stud(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("----------PageController-stud-----------");
		ModelAndView mav = new ModelAndView("student/stud");
		return mav;
	}

	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public ModelAndView emp(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("----------PageController-emp-----------");
		ModelAndView mav = new ModelAndView("employee/emp");
		return mav;
	}

}
