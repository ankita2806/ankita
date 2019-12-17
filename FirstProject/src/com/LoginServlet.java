package com;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("HELLO");
	}
}
