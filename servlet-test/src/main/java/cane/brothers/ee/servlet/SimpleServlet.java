package cane.brothers.ee.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

	private static final long serialVersionUID = -1284937685438437250L;

	private String responseTemplate = "<html>\n" + 
			"<body>\n" + 
			"<h2>Hello from Simple Servlet</h2>\n" + 
			"</body>\n" + 
			"</html>";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.process(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		this.process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setStatus(200);// OK
		response.getWriter().write(responseTemplate);
	}
}
