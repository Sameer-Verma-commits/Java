import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Create PrintWriter object
        PrintWriter out = response.getWriter();

        // Write response
        out.println("<html><body>");
        out.println("<h2>Hello, This is my First Servlet!</h2>");
        out.println("<h2>--WELCOME--</h2>");
        out.println("</body></html>");

        out.close();
    }
}