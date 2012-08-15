import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: wubofeng
 * Date: 12-6-25
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
public class NewTest extends HttpServlet {
    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("hello world");
    }
}
