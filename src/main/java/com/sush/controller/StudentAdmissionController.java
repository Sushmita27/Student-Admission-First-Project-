package com.sush.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){

		ModelAndView modelAndView=new ModelAndView("admissionForm");

		return modelAndView;
	}
	
	@RequestMapping(value="/submitAdmission", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> paras) {
		ModelAndView view= new ModelAndView("admissionSuccess");
		view.addObject("msg","Details submitted by you : name : "+paras.get("studentName")+" and hobby : "+paras.get("studentHobby"));
		return view;
		
	}

}
