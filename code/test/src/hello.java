import javax.xml.crypto.Data;
import java.io.*;
import java.sql.*;
import java.net.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: wubofeng
 * Date: 12-6-20
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
public class hello {

    public static void main(String arg[]) {
        int port = 80;
        String file = "/";
        try {
            URL u = new URL("http://localhost");
            if (u.getPort() != -1) {
                port = u.getPort();
            }
            if (!(u.getProtocol().equalsIgnoreCase("http"))) {
                System.err.println("I only understand http.");
            }
            if (!(u.getFile().equals(""))) {
                file = u.getFile();
            }
            Socket s = new Socket(u.getHost(), port);
            OutputStream theOutput = s.getOutputStream();
            OutputStreamWriter out = new OutputStreamWriter(theOutput);
            out.write("GET " + file + " HTTP/1.0\r\n");
            out.write("Accept: text/plain, text/html, text/*\r\n");
            out.write("\r\n");
            out.flush();
            theOutput.flush();

            InputStream in = s.getInputStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch (MalformedURLException ex) {
            System.err.println("this is not a valid URL");
        }
        catch (IOException ex) {
            System.err.println(ex);
        }
        System.exit(1);
        Socket echoSocket = null;
        //BufferedWriter out = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            //echoSocket = new Socket("127.0.0.1", 6379);
            echoSocket = new Socket("127.0.0.1", 80);

            String request = "GET / HTTP/1.1\r\n";
            request += "Host: localhost\r\n";
            request += "Accept: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8\r\n" +
                    "Accept-Language: en-us,en;q=0.5\r\n" +
                    "Accept-Encoding: deflate\r\n";
            request += "User-Agent: Mozilla/5.0 (X11; Ubuntu; Linux i686; rv:13.0) Gecko/20100101 Firefox/13.0.1\r\n\r\n";
            //request = "PING\r\n";
            //request = "HSET wbf name \"wubofeng\"\r\n";
            //request = "HGET wbf name\r\n";

            out = new PrintWriter(echoSocket.getOutputStream(), true);
            out.print(request);
            out.flush();

            String userInput;
            in = new BufferedReader(new InputStreamReader(
                    echoSocket.getInputStream(), "iso-8859-1"));
            while ((userInput = in.readLine()) != null) {
                System.out.println(userInput);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                out.close();
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    ;
                }
            }

            if (echoSocket != null) {
                try {
                    echoSocket.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
        /*
        try {
            Socket sk = new Socket("http://localhost", 80);
            PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput = null;
            while ((userInput = stdIn.readLine()) != null) {
                pw.println(userInput);
                System.out.println(br.readLine());
            }
            sk.close();
            pw.close();
            br.close();
            stdIn.close();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }


        try {
            URL url = new URL("http://www.burcn.com");
            System.out.println(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
            PreparedStatement ps = conn.prepareStatement("select * from t where id = ?");
            ps.setString(1, "tt");
            //Statement stmt = conn.createStatement();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        */
        System.exit(1);
        Date d = new Date();
        int i = 1;
        //byte b = 1;
        float f = 11.11f;
        boolean b = false;
        char c = 'a';
        int[] ai = new int[2];
        ai[0] = 1;
        ai[1] = 2;
        int[] ai2 = new int[2];
        System.arraycopy(ai, 0, ai2, 0, 2);
        Test tt = new Test();
        tt.t();
        System.out.println(tt.testGetInt());
        SubTest stt = new SubTest();
        stt.t();
        System.out.println(stt.testGetInt());
        System.out.println(i);
        System.out.println(b);
        System.out.println(f);
        System.out.println(c);
        System.out.println(ai[0]);
        System.out.println(ai2.length);
        System.out.println("hello world");

        char[] ac1 = {'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        char[] ac2 = new char[5];
        System.arraycopy(ac1, 0, ac2, 0, 5);
        System.out.println(new String(ac2));

        int s = 1;
        switch (s) {
            case 1:
                s++;
                break;
            case 2:
                s--;
                break;
            default:
                s++;
                break;
        }
        System.out.print(s);
    }
}