package com.sist.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController2 {
	//@RestController는 스크립트문자열을 보낼때 주로 쓰기 때문에  jsp맵핑해주는 Controller가 따로 있어야 한다.
	
	@RequestMapping("temp/input_ok.do")
	public String temp_input_ok(String id){
		String data="";
		
		if (id.equals("admin")) {
			data="<script>"
					+ "alert(\"로그인되었습니다.\");"
					+ "location.href=\"success.do\";"
					+ "</script>";
		}else{
			data="<script>"
					+ "alert(\"로그인실패했습니다..\");"
					+ "location.href=\"fail.do\";"
					+ "</script>";			
		}
		
		return data;
	}
}
