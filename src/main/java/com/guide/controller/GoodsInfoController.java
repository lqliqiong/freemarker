package com.guide.controller;

import com.guide.bean.GoodsInfo;
import com.guide.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lq on 2017/12/1.
 */
@Controller
@RequestMapping("/")
public class GoodsInfoController {

	@Autowired
	private GoodsInfoService goodsInfoService;

	@RequestMapping(value="/goodsList")
	public ModelAndView goodsList(){
		ModelAndView mv = new ModelAndView();
		List<GoodsInfo> list = goodsInfoService.getGoodsList();
		mv.addObject("list",list);
		mv.setViewName("guide/goodsList");
		return mv;
	}



	@RequestMapping(value="/goodsinfo")
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		GoodsInfo info = goodsInfoService.getGoodsInfo();
		mv.addObject("info",info);
		mv.addObject("username","你好！Freemarker!");
		mv.setViewName("guide/goodsInfo");
		return mv;
	}
}

//http://localhost:8080/goodsinfo
