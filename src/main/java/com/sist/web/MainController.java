package com.sist.web;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@RequestMapping("main/input.do")
	public String main_input(){
		
		return "main/input";
	}
	@RequestMapping("main/input_ok.do")
	public String main_input_ok(String name, String sex, RedirectAttributes attr) throws Exception{
		
		/*attr.addAttribute("name", name);
		attr.addAttribute("sex", sex);//get방식으로 보낸다.*/
		
		//데이터 감춰서 보낼때는 Map에 묶어서 addFlashAttribute()로 보내야 한다.
		Map map=new HashMap();
		map.put("name", name);
		map.put("sex", sex);
		attr.addFlashAttribute("map", map);
		
		//Chrome이아니면 encoding해서 보내야 한다. 아래와같이 보내면 브라우저마자 조건을 걸어서 보내야 한다. 위의 버전은 아래와같은걸 안해도 된다.
		//return "redirect:/main/output.do?name="+URLEncoder.encode(name, "UTF-8")+"&sex="+URLEncoder.encode(sex, "UTF-8");
		return "redirect:/main/output.do";
	}
	@RequestMapping("main/output.do")
	public String main_output(String name, String sex, Model model){
		
		model.addAttribute("name", name);
		model.addAttribute("sex", sex);
		
		return "main/output";
	}
	
	@RequestMapping("temp/input")
	public String temp_input(){
		
		return "temp/input";
	}
	@RequestMapping("temp/success")
	public String temp_success(){
		
		return "temp/success";
	}
	@RequestMapping("temp/fail")
	public String temp_fail(){
		
		return "temp/fail";
	}
	
}
