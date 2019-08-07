package com.atguigu.web.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFIstServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("MyFIstServlet 被创建了");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
     
	
	@Override
	public void init(ServletConfig arg0) throws ServletException {

		System.out.println("MyFIstServlet被初始化了");
	}

	//处理请求
	//ServletRequest代表请求对象，包含了请求报文中的所有内容，请求头，请求方式，请求体
	//ServletResponse代表相应对象，包含了相应报文中的所有内容，例如相应头、相应体
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		System.out.println("MyFIstServlet处理请求！！！");
	}
	
	public MyFIstServlet() {
		System.out.println("MyFIstServlet被创建了！");
	}

}
