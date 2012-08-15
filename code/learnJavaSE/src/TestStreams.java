import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreams {

    public static void main(String[] args) throws IOException {
        //testByteStreams();
        //testCharacterStreams();
        //testByteCharacterStreams();
        //testCopyLines();
        //testBufferedStreams();
    }

    public static void testBufferedStreams() throws IOException {
        BufferedReader in = null;
        BufferedWriter out = null;

        try {
            in = new BufferedReader(new FileReader("sample.txt"));
            out = new BufferedWriter(new FileWriter("out.txt"));

            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void testCopyLines() throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new FileReader("sample.txt"));
            out = new PrintWriter(new FileWriter("out.txt"));

            String s;
            while ((s = in.readLine()) != null) {
                out.println(s);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void testByteCharacterStreams() throws IOException {
        FileInputStream in = null;
        FileWriter w = null;

        try {
            in = new FileInputStream("sample.txt");
            w = new FileWriter("out.txt");

            int i;
            while ((i = in.read()) != -1) {
                w.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (w != null) {
                w.close();
            }
        }
    }

    public static void testCharacterStreams() throws IOException {
        FileReader r = null;
        FileWriter w = null;

        try {
            r = new FileReader("sample.txt");
            w = new FileWriter("out.txt");

            int i;
            while ((i = r.read()) != -1) {
                w.write(i);
            }
        } finally {
            if (r != null) {
                r.close();
            }
            if (w != null) {
                w.close();
            }
        }
    }

    public static void testByteStreams() throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("sample.txt");
            out = new FileOutputStream("out.txt");

            int i;

            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

}
