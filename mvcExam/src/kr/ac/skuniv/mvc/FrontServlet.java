package kr.ac.skuniv.mvc;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("*.sku")
public class FrontServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("FrontServlet 실행");
		//System.out.println(request.getRequestURI());		//실제  요청 uri
		//System.out.println(request.getContextPath());
		
		String path = request.getRequestURI().substring(request.getContextPath().length());
		
		
		
//		if("/test.sku".equals(path)) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/test.jsp");
//			rd.forward(request, response);			
//		}else if("/a.sku".equals(path)) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/a.jsp");
//			rd.forward(request, response);
//		}else if("hello.sku".equals(path)) {
//			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/hello.jsp");
//			rd.forward(request, response);
//		}
	}

}
