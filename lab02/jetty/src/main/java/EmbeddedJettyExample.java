import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.servlet.ServletHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmbeddedJettyExample {
    public static void main(String[] args) throws Exception{
        Server server = new Server(8680);

        ServletHandler servletHandler = new ServletHandler();
        server.setHandler(servletHandler);

        servletHandler.addServletWithMapping(HelloServlet.class, "/");

        server.start();
        server.join();
    }
    public static class HelloServlet extends HttpServlet
    {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);
            String username = request.getParameter("username");
            response.getWriter().println("<h1>New Hello Simple Servlet</h1>");
            response.getWriter().format("<h1> %s is the username! </h1>", username);
        }
    }

    public static class HelloHandler extends AbstractHandler{
        public HelloHandler(){
            this("Hello, First Handler!");
        }
        public HelloHandler (String arg){
            this(arg, null);
        }
        public HelloHandler(String arg1, String arg2){
            this.greetmessage = arg1;
            this.bodymessage = arg2;
        }

        public void handle(String target, Request baseRequest, HttpServletRequest request,
                           HttpServletResponse response) throws IOException, ServletException {
            response.setContentType("text/html; charset=utf-8");
            response.setStatus(HttpServletResponse.SC_OK);

            PrintWriter out = response.getWriter();

            out.println(greetmessage);
            if(bodymessage != null){
                out.println(bodymessage);
            }

            baseRequest.setHandled(true);

        }
        final String greetmessage;
        final String bodymessage;
    }
}
