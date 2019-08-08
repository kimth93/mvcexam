package kr.ac.skuniv.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.fw.Action;

public class HelloAction extends Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		//수행할 로직이 있다면 수행, service의 메소드 호출 가능
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/hello.jsp");
		rd.forward(req, resp);

	}
	
	

}
