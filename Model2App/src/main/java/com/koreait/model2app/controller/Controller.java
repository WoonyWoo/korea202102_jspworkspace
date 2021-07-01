package com.koreait.model2app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//모든 하위 컨트롤러가 반드시 구현해야할 메서드 정의
public interface Controller {
	public void execute(HttpServletRequest request, HttpServletResponse response);
	public String getViewName(); //응답시 보여질 결과페이지
}
