package sample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: wubofeng
 * Date: 12-6-25
 * Time: 下午2:10
 * To change this template use File | Settings | File Templates.
 */
public class Test extends HttpServlet {

    public void hello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.println("hello world");
    }

}
