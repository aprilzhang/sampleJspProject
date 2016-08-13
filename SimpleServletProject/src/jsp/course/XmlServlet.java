package jsp.course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		final String userName = request.getParameter("userName");
		final String userId = request.getParameter("userId");
		out.println("Hello from GET method! " + userName + ":" + userId + "!");
	}

	@Override
	protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		final String userName = request.getParameter("userName");
		final String userId = request.getParameter("userId");
		out.println("Hello from POST method!" + userName + ":" + userId + "!");
	}
}
