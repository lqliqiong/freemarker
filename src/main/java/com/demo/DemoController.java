package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/")
public class DemoController {
  
	@RequestMapping(value="/demo1")
	public ModelAndView demo1(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","你好！Freemarker!");
		mv.setViewName("demo/demo1");
		return mv;
	}

	@RequestMapping(value="/demo2")
	public ModelAndView demo2(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("lastUpdated",new Date());
		mv.setViewName("demo/demo2");
		return mv;
	}

	@RequestMapping(value="/demo3")
	public ModelAndView demo3(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("demo/demo3");
		return mv;
	}


	@RequestMapping(value="/demo4")
	public ModelAndView demo4(){
		ModelAndView mv = new ModelAndView();


		mv.setViewName("demo/demo4");
		return mv;
	}
}

//http://localhost:8080/demo1
