package jsp.course;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {

	@Override
	protected void doGet(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		final String userName = request.getParameter("userName");
		final String userId = request.getParameter("userId");
		out.println("Hello from GET method! " + userName + ":" + userId + "!");
	}

	@Override
	protected void doPost(final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {

		response.setContentType("text/html");
		final PrintWriter out = response.getWriter();
		final String userName = request.getParameter("userName");
		final String fullName = request.getParameter("fullName");
		final String userId = request.getParameter("userId");
		out.println("Hello from POST method!" + userName + ":" + userId + ". "
				+ "We know your full name is " + fullName + "!");
		final String prof = request.getParameter("prof");
		out.println("You are a " + prof);
		// final String location = request.getParameter("location");
		final String[] locations = request.getParameterValues("location");
		out.println("You are " + locations.length + " places");
		for (int i = 0; i < locations.length; i++) {
			out.println(locations[i]);
		}
	}
}
