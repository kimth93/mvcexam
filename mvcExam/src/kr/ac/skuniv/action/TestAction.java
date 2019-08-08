package kr.ac.skuniv.action;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.skuniv.fw.Action;

public class TestAction extends Action {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/test.jsp");
		rd.forward(req, resp);
		
	}
	

}
