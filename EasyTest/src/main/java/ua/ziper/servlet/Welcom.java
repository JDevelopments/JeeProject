package ua.ziper.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Welcom extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Welcom() {
        
    }

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		List l = new ArrayList<String>();
		l.add("Обраний колір = " + req.getParameter("color"));
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("3");
		l.add("3");
		l.add("3");
		l.add("3");
		
		req.setAttribute("style", l); // + атрибут до request
		RequestDispatcher dispetcher = req.getRequestDispatcher("welcom.jsp"); 
		dispetcher.forward(req, res); // переадресація на сервлет 		
	}



}
