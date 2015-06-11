package ua.ziper.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Info() {
        
    }

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		Date day = new Date();
		writer.print("Day = " + day);
		writer.close();
	}



}
