package com.bl.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class User extends HttpServlet {
	public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
			throws IOException {
		
//		String userName="pratik";
//		String userPassword="[A-Za-z0-9]+{8}";
		
		String name = httpServletRequest.getParameter("userName");
		PrintWriter printWriter = httpServletResponse.getWriter();
		System.out.println("");
		String password = httpServletRequest.getParameter("password");
		System.out.println("");
		
		
		
		if (name.equalsIgnoreCase("Pratik")) {
			printWriter.println("<font color=green><h1>login succesful</h1></font>");

		} else {
			printWriter.println("<font color=red><h1>login failed</h1></font>");
		}
		
	}
}
