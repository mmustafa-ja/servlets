package com.webproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SqServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out=res.getWriter();
		int sum=0;
		Cookie cookies[]=req.getCookies();
		
		for(Cookie c: cookies) {
			if(c.getName().equals("sum")) {
				sum=Integer.parseInt(c.getValue());
			}
		}
		
		
		sum=sum*sum;
		out.println("the square is "+sum);
	}

}
