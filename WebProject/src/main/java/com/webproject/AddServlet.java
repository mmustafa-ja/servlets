package com.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int sum=i+j;
	
		PrintWriter out=res.getWriter();
			out.println("The result is "+sum);
			Cookie cookie=new Cookie("sum",sum+"");
			res.addCookie(cookie);
			res.sendRedirect("sq");
			
			//req.setAttribute("sum", sum);	
			//RequestDispatcher reg=req.getRequestDispatcher("sq");
			//reg.forward(req,res);
		out.println("Hi<br>");
		ServletConfig cg=getServletConfig();
		String str=cg.getInitParameter("Phone");
		
		out.println(str);
	}
	
	
}
