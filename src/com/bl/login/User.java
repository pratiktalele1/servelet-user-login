package com.bl.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(name);


		int flag = 0;
		while (matcher.find()) {
			flag = 1;
		}
		
		Pattern pattern2 = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*_=+-]).{8,12}$");
		Matcher matcher2 = pattern2.matcher(password);
		
		int flagPass = 0;
		while (matcher2.find()) {
			flagPass = 1;
		}
		
		
		if ((name.equalsIgnoreCase("Pratik")&&flag==1)&&(flagPass==1)) {
			printWriter.println("<font color=green><h1>login succesful</h1></font>");

		} else {
			printWriter.println("<font color=red><h1>login failed</h1></font>");
		}
		
	}
}
