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
		System.out.println("MyFIstServlet ��������");
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

		System.out.println("MyFIstServlet����ʼ����");
	}

	//��������
	//ServletRequest����������󣬰������������е��������ݣ�����ͷ������ʽ��������
	//ServletResponse������Ӧ���󣬰�������Ӧ�����е��������ݣ�������Ӧͷ����Ӧ��
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		System.out.println("MyFIstServlet�������󣡣���");
	}
	
	public MyFIstServlet() {
		System.out.println("MyFIstServlet�������ˣ�");
	}

}
